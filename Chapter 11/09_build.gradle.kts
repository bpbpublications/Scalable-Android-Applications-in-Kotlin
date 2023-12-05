...
kotlin {
    androidTarget()

    sourceSets {

        androidMain.dependencies {
            implementation(project(":features:home:presentation"))
            implementation(libs.koin.android)
        }
        ...
}
...build.gradle.kts