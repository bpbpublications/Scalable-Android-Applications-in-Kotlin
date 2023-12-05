plugins {
    ...
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}
...
android {
    ...
    dependencies {
        implementation(libs.dagger.hilt)
        ksp(libs.dagger.hilt.compiler)
        ...
    }
}