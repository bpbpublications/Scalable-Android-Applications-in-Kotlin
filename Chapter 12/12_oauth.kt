val client = HttpClient {
    ...
    install(Auth) {
        bearer {
            loadTokens { /* BearerTokens object */ }
            refreshTokens { /* BearerTokens object */ }
        }
    }
}
