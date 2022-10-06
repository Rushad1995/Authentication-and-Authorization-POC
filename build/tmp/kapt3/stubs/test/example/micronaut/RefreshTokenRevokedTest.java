package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00110\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lexample/micronaut/RefreshTokenRevokedTest;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "kotlin.jvm.PlatformType", "getClient", "()Lio/micronaut/http/client/HttpClient;", "embeddedServer", "Lio/micronaut/runtime/server/EmbeddedServer;", "getEmbeddedServer", "()Lio/micronaut/runtime/server/EmbeddedServer;", "refreshTokenGenerator", "Lio/micronaut/security/token/generator/RefreshTokenGenerator;", "getRefreshTokenGenerator", "()Lio/micronaut/security/token/generator/RefreshTokenGenerator;", "refreshTokenRepository", "Lexample/micronaut/RefreshTokenRepository;", "getRefreshTokenRepository", "()Lexample/micronaut/RefreshTokenRepository;", "accessingSecuredURLWithoutAuthenticatingReturnsUnauthorized", "", "micronautguide"})
public final class RefreshTokenRevokedTest {
    private final io.micronaut.runtime.server.EmbeddedServer embeddedServer = null;
    private final io.micronaut.http.client.HttpClient client = null;
    private final io.micronaut.security.token.generator.RefreshTokenGenerator refreshTokenGenerator = null;
    private final example.micronaut.RefreshTokenRepository refreshTokenRepository = null;
    
    public RefreshTokenRevokedTest() {
        super();
    }
    
    public final io.micronaut.runtime.server.EmbeddedServer getEmbeddedServer() {
        return null;
    }
    
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final io.micronaut.security.token.generator.RefreshTokenGenerator getRefreshTokenGenerator() {
        return null;
    }
    
    public final example.micronaut.RefreshTokenRepository getRefreshTokenRepository() {
        return null;
    }
    
    @org.junit.jupiter.api.Test()
    public final void accessingSecuredURLWithoutAuthenticatingReturnsUnauthorized() {
    }
}