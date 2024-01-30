package com.example.androidlearning.domain.repository

import androidx.lifecycle.LiveData
import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.model.tvshow.TvShow

interface TvShowRepository {

    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}