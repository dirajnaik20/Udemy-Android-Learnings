package com.example.androidlearning.presentation.di.core

import com.example.androidlearning.data.repository.artist.datasource.ArtistCacheDatasource
import com.example.androidlearning.data.repository.artist.datasource.ArtistLocalDatasource
import com.example.androidlearning.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.androidlearning.data.repository.artist.ArtistRepositoryImpl
import com.example.androidlearning.data.repository.movie.datasource.MovieCacheDatasource
import com.example.androidlearning.data.repository.movie.datasource.MovieLocalDatasource
import com.example.androidlearning.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.androidlearning.data.repository.movie.MovieRepositoryImpl
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowCacheDatasource
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowLocalDatasource
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.androidlearning.data.repository.tvshow.TvShowRepositoryImpl
import com.example.androidlearning.domain.repository.ArtistRepository
import com.example.androidlearning.domain.repository.MovieRepository
import com.example.androidlearning.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDatasource: MovieLocalDatasource,
        movieCacheDatasource: MovieCacheDatasource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDatasource,
            movieCacheDatasource
        )

    }

    @Singleton
    @Provides
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDatasource: TvShowLocalDatasource,
        tvShowCacheDatasource: TvShowCacheDatasource
    ): TvShowRepository {
        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDatasource,
            tvShowCacheDatasource
        )

    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDatasource: ArtistLocalDatasource,
        artistCacheDatasource: ArtistCacheDatasource
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDatasource,
            artistCacheDatasource
        )

    }
}