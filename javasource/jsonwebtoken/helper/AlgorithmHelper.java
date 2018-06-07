package jsonwebtoken.helper;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import com.auth0.jwt.algorithms.Algorithm;
import com.mendix.core.Core;

import jsonwebtoken.proxies.Enum_Algorithm;
import sun.misc.BASE64Decoder;

public class AlgorithmHelper {
	public static Algorithm Algorithm(Enum_Algorithm enumAlgorithm, String secret) 
			throws IllegalArgumentException, UnsupportedEncodingException {
		
		// Check if algorithm enumeration has been provided
		if (enumAlgorithm == null) return null;
		
		// Get log node
		String logNode = jsonwebtoken.proxies.constants.Constants.getLogNode();
			
		// Return Algorithm based on enumeration
		if (enumAlgorithm.equals(Enum_Algorithm.HS256)) {
			return Algorithm.HMAC256(secret);
		} else if (enumAlgorithm.equals(Enum_Algorithm.HS384)) {
			return Algorithm.HMAC384(secret);
		} else if (enumAlgorithm.equals(Enum_Algorithm.HS512)) {
			return Algorithm.HMAC512(secret);
		} else if (enumAlgorithm.equals(Enum_Algorithm.RS256)) {
			RSAPublicKey publicKey = null;
			
			try {	    	
				byte[] publicBytes = Base64.getDecoder().decode(secret);			
				ByteArrayInputStream inputStream  =  new ByteArrayInputStream(publicBytes);
				CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
				X509Certificate cert = (X509Certificate) certFactory.generateCertificate(inputStream);
		        publicKey = (RSAPublicKey) cert.getPublicKey();
			} catch (Exception e) {
				Core.getLogger(logNode).warn("Could not decode public key: " + e.getMessage());
			}
			
			if (publicKey != null) {
				return Algorithm.RSA256(publicKey);
			} else {
				return null;
			}			
		} else {
			return null;
		}
	}
}
