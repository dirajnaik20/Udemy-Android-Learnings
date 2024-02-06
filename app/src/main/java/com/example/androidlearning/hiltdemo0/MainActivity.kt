package com.example.androidlearning.hiltdemo0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlearning.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dataSource: DataSource
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataSource.getRemoteData()
    }
}