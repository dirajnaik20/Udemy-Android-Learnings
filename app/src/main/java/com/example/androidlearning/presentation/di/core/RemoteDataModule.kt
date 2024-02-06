package com.example.androidlearning.presentation.di.core

import com.example.androidlearning.BuildConfig
import com.example.androidlearning.data.api.TMDBService
import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.androidlearning.data.repository.artist.datasourceImpl.ArtistRemoteDatasourceImpl
import com.example.androidlearning.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.androidlearning.data.repository.movie.datasourceImpl.MovieRemoteDatasourceImpl
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.androidlearning.data.repository.tvshow.datasourceImpl.TvShowRemoteDatasourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule() {

    @Singleton
    @Provides
    fun provideRemoteMovieDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDatasourceImpl(tmdbService, BuildConfig.API_KEY)
    }

    @Singleton
    @Provides
    fun provideRemoteTvShowDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDatasourceImpl(tmdbService, BuildConfig.API_KEY)
    }

    @Singleton
    @Provides
    fun provideRemoteArtistDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDatasourceImpl(tmdbService, BuildConfig.API_KEY)
    }
}