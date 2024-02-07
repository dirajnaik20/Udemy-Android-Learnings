package com.example.androidlearning.presentation.di

import com.example.androidlearning.BuildConfig
import com.example.androidlearning.data.api.NewsAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class NetModule {

    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .build()
    }

    @Provides
    fun provideNewsAPIService(retrofit: Retrofit):NewsAPIService{
        return retrofit.create(NewsAPIService::class.java)
    }
}