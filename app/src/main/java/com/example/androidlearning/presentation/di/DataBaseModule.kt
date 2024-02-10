package com.example.androidlearning.presentation.di

import android.app.Application
import androidx.room.Room
import com.example.androidlearning.data.db.ArticleDAO
import com.example.androidlearning.data.db.ArticleDatabase
import com.example.androidlearning.data.model.Article
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule() {
    @Provides
    fun provideNewsDataBase(app:Application):ArticleDatabase{
        return Room.databaseBuilder(app,ArticleDatabase::class.java,"article_db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideArticleDAO(articleDatabase: ArticleDatabase):ArticleDAO{
        return articleDatabase.getArticleDAO()
    }
}