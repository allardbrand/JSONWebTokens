// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package jsonwebtoken.actions;

import java.io.UnsupportedEncodingException;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import jsonwebtoken.helper.AlgorithmHelper;

public class JA_DecodeClaim extends CustomJavaAction<String>
{
	private String token;
	private String secret;
	private String claim;
	private jsonwebtoken.proxies.Enum_Algorithm algorithm;

	public JA_DecodeClaim(IContext context, String token, String secret, String claim, String algorithm)
	{
		super(context);
		this.token = token;
		this.secret = secret;
		this.claim = claim;
		this.algorithm = algorithm == null ? null : jsonwebtoken.proxies.Enum_Algorithm.valueOf(algorithm);
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		String logNode = jsonwebtoken.proxies.constants.Constants.getLogNode();
		String claimValue = null;
		
		// Check if algorithm has been provided
		if (this.algorithm == null) {
			Core.getLogger(logNode).warn("No valid algorithm has been provided");
			return null;
		}
		
		// Create token verifier
		try {
		    JWTVerifier verifier = JWT.require(AlgorithmHelper.Algorithm(this.algorithm, this.secret))
		        .build();
		    
		    // Verify token (raises exception if token is invalid)
		    JWT jwt = (JWT) verifier.verify(this.token);
			
		    // Get claim
		    Claim claim = jwt.getClaim(this.claim);
		    
		    // Check if claim can be found
		    if (claim != null && !claim.isNull()) {
		    	
		    	// Store claim value
		    	claimValue = claim.asString();
		    } else {
		    	Core.getLogger(logNode).warn("Claim '" + this.claim + "' not found within token");
		    }
		} catch (IllegalArgumentException | UnsupportedEncodingException e) {
			Core.getLogger(logNode).warn("Could not create token verifier");
			throw e;
		} catch (JWTVerificationException e) {
			Core.getLogger(logNode).debug("Could not decode token: invalid token provided");
			
			// Token was invalid; re-throw the exception so that this can
			// be handled in an error handler within the microflow
			throw e;
		}
	    
		return claimValue;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "JA_DecodeClaim";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
