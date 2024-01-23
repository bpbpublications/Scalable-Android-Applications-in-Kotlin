...
kotlin {
    androidTarget()

    sourceSets {
        ...
        commonTest.dependencies {
            implementation(libs.junit)
            implementation(libs.coTest)
            implementation(libs.ktor.mock)
        }
    }
}
