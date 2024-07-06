android {
    ...
    flavorDimensions += "distribution"
    productFlavors {
        create("google") {
            dimension = "distribution"
            applicationId = "com.bpp.example.google"
            resValue ("string", "greeting", "My Google App")
        }
        create("amazon") {
            dimension = "distribution"
            applicationId = "com.bpp.example.amazon"
            resValue ("string", "greeting", "My Amazon App")
        }
    }
    ....
