android {
    //...
    defaultConfig {
        //...
        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"
    }
}
//...
dependencies {
    // or version catalogs equivalent ...
    androidTestImplementation(
        "androidx.test.espresso:espresso-core:$vers"
    )

    // optional
    testOptions {
        animationsDisabled = true
    }
}
