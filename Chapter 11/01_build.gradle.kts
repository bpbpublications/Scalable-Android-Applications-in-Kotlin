...
android {
    namespace = "com.bpp.home.presentation"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        ...
    }
    ...
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
...