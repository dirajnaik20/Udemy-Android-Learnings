package com.example.androidlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSubmit.setOnClickListener {
            displayGreetings()
        }
    }

    private fun displayGreetings(){

        binding.apply {
            tvName.text="Hello! ${etName.text}"
        }

    }
}