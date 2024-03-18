class KoinApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@KoinApplication)
            modules(homePresentationModule)
        }
    }
}
