package com.example.androidlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidlearning.MyBackgroundService.Companion.TAG
import com.example.androidlearning.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serviceIntent = Intent(this, MyBackgroundService::class.java)

        binding.btnStart.setOnClickListener {
            Log.i(TAG,"Service Starting.....")
            startService(serviceIntent)
        }

        binding.btnStop.setOnClickListener {
            Log.i(TAG,"Service Stopping.....")
            stopService(serviceIntent)
        }
    }
}