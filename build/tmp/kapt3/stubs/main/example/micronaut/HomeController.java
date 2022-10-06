package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lexample/micronaut/HomeController;", "", "()V", "index", "", "principal", "Ljava/security/Principal;", "micronautguide"})
@io.micronaut.http.annotation.Controller()
@io.micronaut.security.annotation.Secured(value = {"isAuthenticated()"})
public final class HomeController {
    
    public HomeController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    @io.micronaut.http.annotation.Produces(value = {"text/plain"})
    public final java.lang.String index(@org.jetbrains.annotations.NotNull()
    java.security.Principal principal) {
        return null;
    }
}