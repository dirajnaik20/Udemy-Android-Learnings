package com.example.androidlearning.data.repository.movie.datasourceImpl

import com.example.androidlearning.data.db.MovieDao
import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.repository.movie.datasource.MovieLocalDatasource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDatasourceImpl(private val movieDao: MovieDao) : MovieLocalDatasource {
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getALLMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}