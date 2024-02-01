package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.domain.repository.MovieRepository
import com.example.androidlearning.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? =tvShowRepository.updateTvShows()
}