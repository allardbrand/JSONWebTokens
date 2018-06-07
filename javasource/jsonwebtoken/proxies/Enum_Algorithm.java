// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package jsonwebtoken.proxies;

public enum Enum_Algorithm
{
	HS256(new String[][] { new String[] { "en_US", "HMAC with SHA-256" } }),
	HS384(new String[][] { new String[] { "en_US", "HMAC with SHA-384" } }),
	HS512(new String[][] { new String[] { "en_US", "HMAC with SHA-512" } }),
	RS256(new String[][] { new String[] { "en_US", "RSA with SHA-256" } });

	private java.util.Map<String,String> captions;

	private Enum_Algorithm(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
