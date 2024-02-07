package com.example.androidlearning.presentation.di

import android.app.Application
import com.example.androidlearning.domain.usecase.GetNewsHeadlinesUseCase
import com.example.androidlearning.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    fun provideNewsViewModelFactory(
        app: Application,
        getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
    ): NewsViewModelFactory {
        return NewsViewModelFactory(app, getNewsHeadlinesUseCase)
    }
}