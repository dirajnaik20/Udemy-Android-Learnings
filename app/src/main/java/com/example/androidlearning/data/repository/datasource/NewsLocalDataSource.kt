package com.example.androidlearning.data.repository.datasource

import com.example.androidlearning.data.model.Article
import kotlinx.coroutines.flow.Flow

interface NewsLocalDataSource {
    suspend fun getSavedNewsToDB(article: Article)

    fun getSavedArticles():Flow<List<Article>>

}