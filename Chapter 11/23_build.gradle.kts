plugins {
    ...
    alias(libs.plugins.jetbrainsCompose)
}

kotlin {
    androidTarget()

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            @OptIn(ExperimentalComposeLibrary::class)
            implementation(compose.components.resources)
            implementation(project(":features:home:domain"))
        }
    }
}
...