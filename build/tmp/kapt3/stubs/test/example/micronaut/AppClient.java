package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\'J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lexample/micronaut/AppClient;", "", "home", "", "authorization", "login", "Lio/micronaut/security/token/jwt/render/BearerAccessRefreshToken;", "credentials", "Lio/micronaut/security/authentication/UsernamePasswordCredentials;", "micronautguide"})
@io.micronaut.http.client.annotation.Client(value = "/")
public abstract interface AppClient {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/login")
    public abstract io.micronaut.security.token.jwt.render.BearerAccessRefreshToken login(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    io.micronaut.security.authentication.UsernamePasswordCredentials credentials);
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    @io.micronaut.http.annotation.Consumes(value = {"text/plain"})
    public abstract java.lang.String home(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Header(value = "Authorization")
    java.lang.String authorization);
}