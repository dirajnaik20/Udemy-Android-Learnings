package com.example.androidlearning.domain.repository

import androidx.lifecycle.LiveData
import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.model.tvshow.TvShow

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}