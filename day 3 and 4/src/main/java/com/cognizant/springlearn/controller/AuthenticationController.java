package com.cognizant.springlearn.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.SpringLearnApplication;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@GetMapping("/authenticate")
	public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader

	) {
		LOGGER.info("STARTING");

		Map<String, String> returnValue = new HashMap<>();
		returnValue.put("token", "");
		LOGGER.debug(authHeader);
		LOGGER.info("ENDING");
		//String User=getUser(authHeader);
		returnValue.put("token",generateJwt(getUser(authHeader)));
		
		return returnValue;

	}

	private String getUser(String authHeader) {
		LOGGER.info("STARTING");
		byte[] decoded = Base64.getDecoder().decode("dXNlcjpwd2Q=");
		String user = new String(decoded);
		LOGGER.debug(user);
		LOGGER.info("Ending");
		return user;

	}

	private String generateJwt(String user) {
		JwtBuilder builder = Jwts.builder();

		builder.setSubject(user);

		// Set the token issue time as current time

		builder.setIssuedAt(new Date());

		// Set the token expiry as 20 minutes from now

		builder.setExpiration(new Date((new Date()).getTime() + 1200000));

		builder.signWith(SignatureAlgorithm.HS256, "secretkey");

		String token = builder.compact();

		return token;
	}

}
