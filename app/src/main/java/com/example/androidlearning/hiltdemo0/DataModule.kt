package com.example.androidlearning.hiltdemo0

import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun providesDataSource():DataSource{
        return DataSource()
    }
}