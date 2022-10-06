package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lexample/micronaut/RefreshTokenNotFoundTest;", "", "()V", "client", "Lio/micronaut/http/client/HttpClient;", "getClient", "()Lio/micronaut/http/client/HttpClient;", "setClient", "(Lio/micronaut/http/client/HttpClient;)V", "refreshTokenGenerator", "Lio/micronaut/security/token/generator/RefreshTokenGenerator;", "getRefreshTokenGenerator", "()Lio/micronaut/security/token/generator/RefreshTokenGenerator;", "setRefreshTokenGenerator", "(Lio/micronaut/security/token/generator/RefreshTokenGenerator;)V", "accessingSecuredURLWithoutAuthenticatingReturnsUnauthorized", "", "micronautguide"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest()
public final class RefreshTokenNotFoundTest {
    @io.micronaut.http.client.annotation.Client(value = "/")
    @jakarta.inject.Inject()
    public io.micronaut.http.client.HttpClient client;
    @jakarta.inject.Inject()
    public io.micronaut.security.token.generator.RefreshTokenGenerator refreshTokenGenerator;
    
    public RefreshTokenNotFoundTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.http.client.HttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    io.micronaut.http.client.HttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.micronaut.security.token.generator.RefreshTokenGenerator getRefreshTokenGenerator() {
        return null;
    }
    
    public final void setRefreshTokenGenerator(@org.jetbrains.annotations.NotNull()
    io.micronaut.security.token.generator.RefreshTokenGenerator p0) {
    }
    
    @org.junit.jupiter.api.Test()
    public final void accessingSecuredURLWithoutAuthenticatingReturnsUnauthorized() {
    }
}