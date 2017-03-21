# JSON Web Tokens
Module for generating, verifying and decoding JSON Web Tokens (JWT). JSON Web Tokens are an open, industry standard RFC 7519 method for representing claims securely between two parties.

Please see https://jwt.io/ for more information about JWT.

# Typical usage scenario
Authentication, Deeplinks

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
