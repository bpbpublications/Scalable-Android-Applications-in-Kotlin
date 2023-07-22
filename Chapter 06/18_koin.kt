package com.aimicor.example.myapplication

import android.app.Application
import myModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication1 : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication1)
            modules(myModule)
        }
    }
}
