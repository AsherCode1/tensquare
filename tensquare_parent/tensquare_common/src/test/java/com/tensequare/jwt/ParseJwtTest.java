package com.tensequare.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;

public class ParseJwtTest {
    public static void main(String[] args) {
        Claims claims = Jwts.parser()
                .setSigningKey("itcast")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMTEyOTI5NzAyMTk4MjUxNTIwIiwic3ViIjoiYWRtaW4iLCJpYXQiOjE1NTQxODMxMTksInJvbGVzIjoiYWRtaW4iLCJleHAiOjE1NTQxODY3MTl9.f0w6uXssfv_v-4RZImqCB4147hG_aNtreso7EWCu9jk")
                .getBody();
        System.out.println("用户id："+claims.getId());
        System.out.println("用户名："+claims.getSubject());
        System.out.println("登录时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getIssuedAt()));
        System.out.println("过期时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(claims.getExpiration()));
        System.out.println("用户角色："+claims.get("role"));
    }
}
