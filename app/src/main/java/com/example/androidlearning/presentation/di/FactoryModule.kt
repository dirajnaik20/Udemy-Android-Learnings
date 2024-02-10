package com.example.androidlearning.presentation.di

import android.app.Application
import com.example.androidlearning.domain.usecase.GetNewsHeadlinesUseCase
import com.example.androidlearning.domain.usecase.GetSavedNewsUseCase
import com.example.androidlearning.domain.usecase.GetSearchedNewsUseCase
import com.example.androidlearning.domain.usecase.SaveNewsUseCase
import com.example.androidlearning.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Provides
    fun provideNewsViewModelFactory(
        app: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
        getSearchedNewsUseCase: GetSearchedNewsUseCase,
        saveNewsUseCase: SaveNewsUseCase,
        getSavedNewsUseCase: GetSavedNewsUseCase


    ): NewsViewModelFactory {
        return NewsViewModelFactory(
            app,
            getNewsHeadlinesUseCase,
            getSearchedNewsUseCase,
            saveNewsUseCase,
            getSavedNewsUseCase
        )
    }
}