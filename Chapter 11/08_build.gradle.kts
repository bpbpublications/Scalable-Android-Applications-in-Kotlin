...
kotlin {
    androidTarget()

    sourceSets {
        commonMain.dependencies {
            implementation(project(":features:home:data"))
            implementation(project(":features:home:domain"))
            implementation(libs.koin.core)
        }
    }
}
...