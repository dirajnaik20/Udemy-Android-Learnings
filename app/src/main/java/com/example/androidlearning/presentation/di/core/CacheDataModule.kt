package com.example.androidlearning.presentation.di.core

import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.data.repository.artist.datasource.ArtistCacheDatasource
import com.example.androidlearning.data.repository.artist.datasource.ArtistLocalDatasource
import com.example.androidlearning.data.repository.artist.datasourceImpl.ArtistCacheDatasourceImpl
import com.example.androidlearning.data.repository.movie.datasource.MovieCacheDatasource
import com.example.androidlearning.data.repository.movie.datasourceImpl.MovieCacheDatasourceImpl
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowCacheDatasource
import com.example.androidlearning.data.repository.tvshow.datasourceImpl.TvshowCacheDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideCacheMovieDataSource():MovieCacheDatasource{
        return MovieCacheDatasourceImpl()
    }
    @Singleton
    @Provides
    fun provideCacheTvShowDataSource(): TvShowCacheDatasource {
        return TvshowCacheDatasourceImpl()
    }
    @Singleton
    @Provides
    fun provideCacheArtistDataSource(): ArtistCacheDatasource {
        return ArtistCacheDatasourceImpl()
    }
}