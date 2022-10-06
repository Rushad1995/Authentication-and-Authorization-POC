package example.micronaut;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u001a\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lexample/micronaut/RefreshTokenRepository;", "Lio/micronaut/data/repository/CrudRepository;", "Lexample/micronaut/RefreshTokenEntity;", "", "findByRefreshToken", "Ljava/util/Optional;", "refreshToken", "", "save", "username", "revoked", "", "updateByUsername", "micronautguide"})
@io.micronaut.data.jdbc.annotation.JdbcRepository(dialect = io.micronaut.data.model.query.builder.sql.Dialect.H2)
public abstract interface RefreshTokenRepository extends io.micronaut.data.repository.CrudRepository<example.micronaut.RefreshTokenEntity, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    public abstract example.micronaut.RefreshTokenEntity save(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String refreshToken, boolean revoked);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<example.micronaut.RefreshTokenEntity> findByRefreshToken(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String refreshToken);
    
    public abstract long updateByUsername(@org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    java.lang.String username, boolean revoked);
}