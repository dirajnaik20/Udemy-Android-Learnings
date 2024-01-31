package com.example.androidlearning.data.repository.movie.datasource

import com.example.androidlearning.data.model.movie.Movie

interface MovieLocalDatasource {

    suspend fun getMoviesFromDB():List<Movie>
    suspend fun saveMoviesToDB(movies:List<Movie>)
    suspend fun clearAll()
}