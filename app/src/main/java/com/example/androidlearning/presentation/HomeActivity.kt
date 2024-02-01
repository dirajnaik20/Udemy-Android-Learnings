package com.example.androidlearning.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.androidlearning.R
import com.example.androidlearning.databinding.ActivityMainBinding
import com.example.androidlearning.presentation.artist.ArtistActivity
import com.example.androidlearning.presentation.movie.MovieActivity
import com.example.androidlearning.presentation.tvshow.TvShowActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.movieButton.setOnClickListener {
            val intent=Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        binding.artistButton.setOnClickListener {
            val intent=Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }

        binding.tvShowButton.setOnClickListener {
            val intent=Intent(this, TvShowActivity::class.java)
            startActivity(intent)
        }
    }
}