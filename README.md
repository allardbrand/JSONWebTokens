# JSON Web Tokens
Module for generating, verifying and decoding JSON Web Tokens (JWT). JWT is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed.

Please see https://jwt.io/ and/or https://jwt.io/introduction/ for more information about JWT.

# Typical usage scenario
Authentication, Deeplinks

Example scenario for use in deeplinks: 
1) Make sure the entity you want to deeplink to has an unique number or guid
2) Use the 'Generate token' action to generate a token for this number. In other words: for a customer with unique number 12345, create a token with the claim 'customer' = 12345. The corresponding JWT token would be: eyJhbGciOiJIUzI1NiJ9.eyJjdXN0b21lciI6IjEyMzQ1In0.1luA-mT4GdwihX0o0XLZcG9maEv5MZCxAyqfBgkTfnc
3) Set-up a deeplink which accepts a string parameter for the JWT token. Make sure to configure the deeplink to include the GET parameter. A valid deeplink example for the previous token could be: http://localhost:8080/link/jwt-deeplink/eyJhbGciOiJIUzI1NiJ9.eyJjdXN0b21lciI6IjEyMzQ1In0.1luA-mT4GdwihX0o0XLZcG9maEv5MZCxAyqfBgkTfnc 
4) In the deeplink microflow, verify the token using the 'Verify token' action
5) If valid, decode the unique number using 'Decode single claim'
6) In the deeplink microflow, retrieve the entity using the unique number from the decoded claim

You can also combine step 4 and 5 by using an error handler on the 'Decode single claim' action. Whenever you try to decode a single claim for an invalid token, an exception will be raised. You could use the error handler flow to handle invalid tokens.

You can validate your tokens (and the token used in the example above) on https://jwt.io/.

# Features and limitations
Module features:
- Generate a JWT token
- Verify a JWT token
- Decode full JWT token
- Decode a single claim from a JWT token

Currently only the HMAC based algorithms are supported (see list below). RSA based algorithms will be added later.
- HMAC with SHA-256
- HMAC with SHA-384
- HMAC with SHA-512

# Dependencies
Mendix 6.8.1 or higher

# Copyright
Based on https://github.com/auth0/java-jwt by Auth0 (http://www.auth0.com)
