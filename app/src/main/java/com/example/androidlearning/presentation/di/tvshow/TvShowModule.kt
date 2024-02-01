package com.example.androidlearning.presentation.di.tvshow

import com.example.androidlearning.domain.usecase.GetTvShowsUseCase
import com.example.androidlearning.domain.usecase.UpdateTvShowsUseCase
import com.example.androidlearning.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun providerTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }
}