package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.domain.repository.MovieRepository
import com.example.androidlearning.domain.repository.TvShowRepository

class UpdateMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? =movieRepository.updateMovies()
}