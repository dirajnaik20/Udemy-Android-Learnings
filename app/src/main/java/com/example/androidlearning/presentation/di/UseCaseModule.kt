package com.example.androidlearning.presentation.di

import com.example.androidlearning.domain.repository.NewsRepository
import com.example.androidlearning.domain.usecase.GetNewsHeadlinesUseCase
import com.example.androidlearning.domain.usecase.GetSavedNewsUseCase
import com.example.androidlearning.domain.usecase.GetSearchedNewsUseCase
import com.example.androidlearning.domain.usecase.SaveNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideGetNewsHeadlinesUseCase(
        newsRepository: NewsRepository
    ): GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }

    @Provides
    fun provideGetSearchedNewsHeadlinesUseCase(
        newsRepository: NewsRepository
    ): GetSearchedNewsUseCase {
        return GetSearchedNewsUseCase(newsRepository)
    }

    @Provides
    fun provideSaveNewsUseCase(
        newsRepository: NewsRepository
    ): SaveNewsUseCase {
        return SaveNewsUseCase(newsRepository)
    }
    @Provides
    fun provideGetSavedNewsUseCase(
        newsRepository: NewsRepository
    ): GetSavedNewsUseCase {
        return GetSavedNewsUseCase(newsRepository)
    }
}