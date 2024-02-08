package com.example.androidlearning.presentation.di

import com.example.androidlearning.presentation.adapter.NewsAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NewsAdapterModule {

    @Provides
    fun provideNewsAdapter():NewsAdapter{
        return NewsAdapter()
    }
}