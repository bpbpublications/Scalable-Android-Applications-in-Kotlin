...
kotlin {
    ...
    sourceSets {
        androidMain.dependencies {
            implementation(libs.ktor.android)
        }
        commonMain.dependencies {
            implementation(project(":features:home:domain"))
            implementation(libs.ktor.serializationJson)
            implementation(libs.ktor.contentNegotiation)
        }
    }
}
...
