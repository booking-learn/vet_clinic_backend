package ca.vetClinic.infra.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;

@Component
@RequiredArgsConstructor
public class JwtExtractor {
	private final JwtKeyProvider jwtKeyProvider;

	public String extractUsername(String token) {
		return getClaims(token).getSubject();
	}

	public String extractRole(String token) {
		return getClaims(token).get("role", String.class);
	}

	private Claims getClaims(String token) {
		SecretKey key = jwtKeyProvider.generate();
		return Jwts.parser().verifyWith(key).build().parseSignedClaims(token).getPayload();
	}
}
