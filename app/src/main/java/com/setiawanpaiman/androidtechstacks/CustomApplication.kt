package com.setiawanpaiman.androidtechstacks

import android.app.Application
import org.koin.android.ext.android.startKoin

/**
 * Created by Setiawan Paiman on 26/7/18.
 */
class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf())
    }
}