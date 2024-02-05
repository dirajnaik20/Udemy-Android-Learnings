package com.example.androidlearning.hiltdemo0

import android.app.Application

class App:Application() {

    lateinit var dataComponent: DataComponent
    override fun onCreate() {
        super.onCreate()
    }
}