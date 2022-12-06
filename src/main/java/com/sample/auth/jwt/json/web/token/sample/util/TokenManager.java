package com.sample.auth.jwt.json.web.token.sample.util;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class TokenManager implements Serializable {

	private static final long serialVersionUID = -2843623263047701254L;
	
	public static final long TOKEN_VALIDITY = 10 * 60 * 60;
	private String jwtSecret = "This is secret key";
	
	public String generateJwtToken(UserDetails userDetails) {
			Map<String,Object> claims = new HashMap<>();
			return Jwts.builder().setClaims(claims)
					.setSubject(userDetails.getUsername())
//					.setIssuedAt(new Date(System.currentTimeMillis()))
//					.setExpiration(new Date(System.currentTimeMillis() + TOKEN_VALIDITY * 1000))
					.signWith(SignatureAlgorithm.HS512, jwtSecret)
					.compact();
							
	}
	
}
