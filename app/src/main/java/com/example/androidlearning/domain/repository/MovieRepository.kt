package com.example.androidlearning.domain.repository

import androidx.lifecycle.LiveData
import com.example.androidlearning.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}