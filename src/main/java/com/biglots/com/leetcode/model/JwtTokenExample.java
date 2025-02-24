/*
package com.biglots.com.leetcode.model;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class JwtTokenExample {

    public static void main(String[] args) {
            String secretKey = "mySecretKey";

            String token = Jwts.builder()
                    .setSubject("user123")
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1-hour expiry
                    .signWith(SignatureAlgorithm.HS256, secretKey)
                    .compact();

            System.out.println("JWT Token: " + token);
    }
}

*/
