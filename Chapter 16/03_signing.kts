android {
    ...
    signingConfigs {
        create("release") {
            storeFile = file(System.getenv("KEYSTOREFILE") ?: "")
            storePassword = System.getenv("KEYSTOREPASS") ?: ""
            keyAlias = System.getenv("KEYSTOREALIAS") ?: ""
            keyPassword = System.getenv("KEYSTOREPASS") ?: ""
        }
    }
    buildTypes {
        getByName("release") {
            ...
            signingConfig = signingConfigs.getByName("release")
        }
    }
}
