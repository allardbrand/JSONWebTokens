package jsonwebtoken.helper;

import java.io.UnsupportedEncodingException;
import com.auth0.jwt.algorithms.Algorithm;
import jsonwebtoken.proxies.Enum_Algorithm;

public class AlgorithmHelper {
	public static Algorithm Algorithm(Enum_Algorithm enumAlgorithm, String secret) 
			throws IllegalArgumentException, UnsupportedEncodingException {
		
		// Check if algorithm enumeration has been provided
		if (enumAlgorithm == null) return null;
		
		// Return Algorithm based on enumeration
		if (enumAlgorithm.equals(Enum_Algorithm.HS256)) {
			return Algorithm.HMAC256(secret);
		} else if (enumAlgorithm.equals(Enum_Algorithm.HS384)) {
			return Algorithm.HMAC384(secret);
		} else if (enumAlgorithm.equals(Enum_Algorithm.HS512)) {
			return Algorithm.HMAC512(secret);
		} else {
			return null;
		}
	}
}
