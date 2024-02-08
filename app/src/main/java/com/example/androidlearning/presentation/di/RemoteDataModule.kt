package com.example.androidlearning.presentation.di

import com.example.androidlearning.data.api.NewsAPIService
import com.example.androidlearning.data.repository.datasource.NewsRemoteDataSource
import com.example.androidlearning.data.repository.datasourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule() {

    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService):NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)

    }
}