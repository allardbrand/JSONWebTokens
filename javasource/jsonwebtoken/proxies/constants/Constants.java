// This file was generated by Mendix Modeler 6.8.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package jsonwebtoken.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the JSONWebToken module

	public static String getLogNode()
	{
		return (String)Core.getConfiguration().getConstantValue("JSONWebToken.LogNode");
	}
}