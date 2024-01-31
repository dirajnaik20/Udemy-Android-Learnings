package com.example.androidlearning.data.repository.movie.datasourceImpl

import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.repository.movie.datasource.MovieCacheDatasource

class MovieCacheDatasourceImpl: MovieCacheDatasource {

    private lateinit var movieList:ArrayList<Movie>
    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList= ArrayList(movies)
    }
}