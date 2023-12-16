package com.cours.spring2.services;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
@RequiredArgsConstructor
public class JwtService {
    public static final String SECRET = "41R8Sab3cjF951smVrJI2/6TSivjW6j2shW+A6v/2J0=";
    public String extractUserName(String token) {
        //TODO call for the extracting of the information in the token

    }

    public String generateToken(UserDetails userDetails) {
        //TODO call for the creating of the token

    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        //TODO Test if the token is Valid

    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsResolvers) {
        //TODO Extration of information in the token
    }

    private String generateToken(Map<String, Object> extraClaims, UserDetails userDetails) {
        //TODO create the JWT TOKEN
    }

    private boolean isTokenExpired(String token) {
        //TODO test if token is Expired

    }

    private Date extractExpiration(String token) {
        //TODO set Expiration date

    }

    private Claims extractAllClaims(String token) {
        //TODO Extration of information in the token

    }

    private Key getSigningKey() {
       //TODO SIGN THE KEY TO ADD TO THE JWT
    }
}
