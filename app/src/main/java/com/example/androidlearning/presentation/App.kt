package com.example.androidlearning.presentation

import android.app.Application
import com.example.androidlearning.presentation.di.Injector
import com.example.androidlearning.presentation.di.artist.ArtistSubComponent
import com.example.androidlearning.presentation.di.core.AppComponent
import com.example.androidlearning.presentation.di.movie.MovieSubComponent
import com.example.androidlearning.presentation.di.tvshow.TvShowSubComponent

class App:Application(),Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent
    }
    override fun createMovieSubComponent(): MovieSubComponent {
        TODO("Not yet implemented")
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        TODO("Not yet implemented")
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        TODO("Not yet implemented")
    }
}