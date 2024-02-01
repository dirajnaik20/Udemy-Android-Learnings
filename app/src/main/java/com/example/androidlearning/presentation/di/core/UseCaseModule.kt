package com.example.androidlearning.presentation.di.core

import com.example.androidlearning.domain.repository.ArtistRepository
import com.example.androidlearning.domain.repository.MovieRepository
import com.example.androidlearning.domain.repository.TvShowRepository
import com.example.androidlearning.domain.usecase.GetArtistsUseCase
import com.example.androidlearning.domain.usecase.GetMoviesUseCase
import com.example.androidlearning.domain.usecase.GetTvShowsUseCase
import com.example.androidlearning.domain.usecase.UpdateArtistsUseCase
import com.example.androidlearning.domain.usecase.UpdateMoviesUseCase
import com.example.androidlearning.domain.usecase.UpdateTvShowsUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMoviesUseCase(movieRepository: MovieRepository): GetMoviesUseCase {
        return GetMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideUpdateMoviesUseCase(movieRepository: MovieRepository): UpdateMoviesUseCase {
        return UpdateMoviesUseCase(movieRepository)
    }

    @Provides
    fun provideGetTvShowUseCase(tvShowRepository: TvShowRepository): GetTvShowsUseCase {
        return GetTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideUpdateTvShowUseCase(tvShowRepository: TvShowRepository): UpdateTvShowsUseCase {
        return UpdateTvShowsUseCase(tvShowRepository)
    }

    @Provides
    fun provideGetArtistUseCase(artistRepository: ArtistRepository): GetArtistsUseCase {
        return GetArtistsUseCase(artistRepository)
    }

    @Provides
    fun provideUpdateArtistUseCase(artistRepository: ArtistRepository): UpdateArtistsUseCase {
        return UpdateArtistsUseCase(artistRepository)
    }

}