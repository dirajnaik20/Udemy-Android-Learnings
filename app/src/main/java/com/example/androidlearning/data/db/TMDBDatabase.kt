package com.example.androidlearning.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.data.model.tvshow.TvShow

@Database(entities =[Movie::class,TvShow::class,Artist::class], version = 1, exportSchema = false)
abstract class TMDBDatabase:RoomDatabase() {
    abstract fun movieDao():MovieDao
    abstract fun tvShowDao():TvShowDao
    abstract fun artistDao():ArtistDao

}