package com.example.androidlearning.presentation.di

import com.example.androidlearning.data.repository.NewsRepositoryImpl
import com.example.androidlearning.data.repository.datasource.NewsRemoteDataSource
import com.example.androidlearning.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}