package com.example.androidlearning.presentation.di.core

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.androidlearning.data.db.ArtistDao
import com.example.androidlearning.data.db.MovieDao
import com.example.androidlearning.data.db.TMDBDatabase
import com.example.androidlearning.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule{

    @Singleton
    @Provides
    fun provideTMDBDatabase(app:Application):TMDBDatabase{
        return Room.databaseBuilder(app,TMDBDatabase::class.java,"tmdbclient")
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase):MovieDao{
        return tmdbDatabase.movieDao()
    }
    @Singleton
    @Provides
    fun provideTvShowDao(tmdbDatabase: TMDBDatabase):TvShowDao{
        return tmdbDatabase.tvShowDao()
    }
    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase):ArtistDao{
        return tmdbDatabase.artistDao()
    }

}