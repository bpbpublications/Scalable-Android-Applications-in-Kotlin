val ktorClient = HttpClient {
    install(HttpCache) {
        // In-memory cache by default
        // For persistent cache:
        // diskStorage(File("cacheDir"))
    }
}
