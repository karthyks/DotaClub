package com.github.karthyks.dotaclub.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DotaClub: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}