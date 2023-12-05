plugins {
    ...
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}
...
dependencies {
    implementation(project(":features:home:domain"))
    implementation(project(":features:home:data"))
    implementation(libs.dagger.hilt)
    ksp(libs.dagger.hilt.compiler)
    ...
}