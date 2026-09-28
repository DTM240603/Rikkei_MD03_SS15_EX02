package re.edu.hw.ss15.ex02.dto.response;

public record JwtResponse(
        String accessToken,
        String refreshToken,
        String tokenType,
        long expiresIn
) {
}
