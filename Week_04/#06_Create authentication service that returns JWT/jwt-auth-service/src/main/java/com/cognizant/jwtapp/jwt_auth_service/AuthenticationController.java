package com.cognizant.jwtapp.jwt_auth_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    private final TokenUtil tokenUtil;

    public AuthenticationController(TokenUtil tokenUtil) {
        this.tokenUtil = tokenUtil;
    }

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
        }

        String base64Credentials = authHeader.substring("Basic ".length());
        byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
        String credentials = new String(credDecoded);
        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        if ("user".equals(username) && "pwd".equals(password)) {
            String token = tokenUtil.generateToken(username);
            return ResponseEntity.ok().body("{\"token\": \"" + token + "\"}");
        } else {
            return ResponseEntity.status(401).body("Invalid Credentials");
        }
    }
}
