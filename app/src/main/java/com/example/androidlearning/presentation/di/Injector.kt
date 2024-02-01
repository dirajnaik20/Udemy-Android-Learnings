package com.example.androidlearning.presentation.di

import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.presentation.di.artist.ArtistSubComponent
import com.example.androidlearning.presentation.di.movie.MovieSubComponent
import com.example.androidlearning.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent():MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}