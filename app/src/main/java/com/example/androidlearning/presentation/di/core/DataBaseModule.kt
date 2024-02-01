package com.example.androidlearning.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.example.androidlearning.data.db.ArtistDao
import com.example.androidlearning.data.db.MovieDao
import com.example.androidlearning.data.db.TMDBDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule{

    @Singleton
    @Provides
    fun provideTMDBDatabase(context: Context):TMDBDatabase{
        return Room.databaseBuilder(context,TMDBDatabase::class.java,"tmdbclient")
            .build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase):MovieDao{
        return tmdbDatabase.movieDao()
    }
    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase):ArtistDao{
        return tmdbDatabase.artistDao()
    }

}