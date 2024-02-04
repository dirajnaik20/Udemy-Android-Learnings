package com.example.androidlearning


import android.app.Service;
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyBackgroundService : Service() {

    init {
        Log.i(TAG,"Service has been created")
    }
    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i(TAG,"Service is started")
        return START_STICKY
    }
    override fun onDestroy() {
        Log.i(TAG,"destroying...")
        super.onDestroy()
    }

    companion object{
        const val TAG="MYTAG"
    }

}