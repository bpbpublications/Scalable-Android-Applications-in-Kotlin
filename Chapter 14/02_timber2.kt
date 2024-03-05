class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            // For production,  might want
            //  to plant a different tree.  For example,
            // Crashlytics or another logging service.
        }
    }
}
