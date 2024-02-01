package com.example.androidlearning.presentation.di.core

import com.example.androidlearning.data.db.ArtistDao
import com.example.androidlearning.data.db.MovieDao
import com.example.androidlearning.data.db.TvShowDao
import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.data.repository.artist.datasource.ArtistLocalDatasource
import com.example.androidlearning.data.repository.artist.datasourceImpl.ArtistLocalDatasourceImpl
import com.example.androidlearning.data.repository.movie.datasource.MovieLocalDatasource
import com.example.androidlearning.data.repository.movie.datasourceImpl.MovieLocalDatasourceImpl
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowLocalDatasource
import com.example.androidlearning.data.repository.tvshow.datasourceImpl.TvShowLocalDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalMovieDataSource(movieDao: MovieDao): MovieLocalDatasource {
        return MovieLocalDatasourceImpl(movieDao)
    }
    @Singleton
    @Provides
    fun provideLocalTvShowDataSource(tvShowDao: TvShowDao): TvShowLocalDatasource {
        return TvShowLocalDatasourceImpl(tvShowDao)
    }
    @Singleton
    @Provides
    fun provideLocalArtistDataSource(artistDao: ArtistDao): ArtistLocalDatasource {
        return ArtistLocalDatasourceImpl(artistDao  )
    }
}