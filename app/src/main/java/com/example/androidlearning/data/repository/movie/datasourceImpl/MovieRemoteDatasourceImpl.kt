package com.example.androidlearning.data.repository.movie.datasourceImpl

import com.example.androidlearning.data.api.TMDBService
import com.example.androidlearning.data.model.movie.MovieList
import com.example.androidlearning.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDatasourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> {
        return tmdbService.getPopularMovies(apiKey)
    }
}