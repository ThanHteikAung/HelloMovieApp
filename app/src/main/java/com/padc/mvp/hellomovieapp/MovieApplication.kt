package com.padc.mvp.hellomovieapp

import android.app.Application
import com.padc.mvp.hellomovieapp.data.models.MovieModelImpl

class MovieApplication:Application() {
    override fun onCreate() {
        super.onCreate()

        MovieModelImpl.initDatabase(applicationContext)
    }
}