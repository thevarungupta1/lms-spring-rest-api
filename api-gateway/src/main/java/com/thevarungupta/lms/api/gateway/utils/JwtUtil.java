package com.thevarungupta.lms.api.gateway.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {

    private String jwtSecret = "87ed8805c0e3f289607d5cfdca7a13bd32243e5e5479d8cf3f71bfb641b0d82f";
    private Long jwtExpirationDate = 604800L;
    // generate token

    public void validateToken(final String token) {
        Jwts.parser()
                .verifyWith((SecretKey) key())
                .build()
                .parseClaimsJwt(token);
    }


    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

}