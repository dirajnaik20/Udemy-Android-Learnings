package com.example.androidlearning.data.repository.movie.datasource

import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies():Response<MovieList>
}