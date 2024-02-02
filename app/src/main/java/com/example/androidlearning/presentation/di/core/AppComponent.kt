package com.example.androidlearning.presentation.di.core

import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.presentation.di.artist.ArtistSubComponent
import com.example.androidlearning.presentation.di.movie.MovieSubComponent
import com.example.androidlearning.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class,
        CacheDataModule::class,
        DataBaseModule::class,
        RepositoryModule::class,
        DataBaseModule::class,
        LocalDataModule::class,
        NetModule::class,
        RemoteDataModule::class,
        RemoteDataModule::class,
        UseCaseModule::class]
)
interface AppComponent {

    fun movieSubComponent(): MovieSubComponent.Factory
    fun tvShowSubComponent(): TvShowSubComponent.Factory
    fun artistSubComponent(): ArtistSubComponent.Factory
}