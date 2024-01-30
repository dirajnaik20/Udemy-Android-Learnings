package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.domain.repository.MovieRepository

class UpdateTvShowsUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? =movieRepository.updateMovies()
}