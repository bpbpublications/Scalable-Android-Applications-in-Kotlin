plugins {
    ...
    alias(libs.plugins.kapt)
    alias(libs.plugins.hilt)
}
...
dependencies {
    implementation(project(":features:home:domain"))
    implementation(project(":features:home:di"))
    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hilt.compiler)
    ...
}