package com.example.androidlearning.presentation.di

import com.example.androidlearning.data.db.ArticleDAO
import com.example.androidlearning.data.repository.datasource.NewsLocalDataSource
import com.example.androidlearning.data.repository.datasourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO):NewsLocalDataSource{
        return  NewsLocalDataSourceImpl(articleDAO)
    }
}