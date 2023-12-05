...
kotlin {
    androidTarget()

    sourceSets {
        commonMain.dependencies {
            implementation(project(":features:home:domain"))
            implementation(project(":features:home:data"))
        }
    }
}
...