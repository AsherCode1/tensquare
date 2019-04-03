package com.tensequare.jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class CreateJwt {
    public static void main(String[] args) {
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId("1112914572337090560")
                .setSubject("ashercode")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "codewj")
                .setExpiration(new Date(new Date().getTime()+24*60*60000))
                .claim("role", "user");
        System.out.println(jwtBuilder.compact());
    }
}
