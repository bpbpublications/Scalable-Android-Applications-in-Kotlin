plugins {
    ...
    alias(libs.plugins.kapt)
    alias(libs.plugins.hilt)
}
...
android {
    dependencies {
        implementation(libs.dagger.hilt)
        add("kapt", libs.dagger.hilt.compiler)
        ...
    }
}

