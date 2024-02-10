package com.example.androidlearning.data.repository.datasourceImpl

import com.example.androidlearning.data.db.ArticleDAO
import com.example.androidlearning.data.model.Article
import com.example.androidlearning.data.repository.datasource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(
    private val articleDao: ArticleDAO
) : NewsLocalDataSource {
    override suspend fun getSavedNewsToDB(article: Article) {
        articleDao.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
        return articleDao.getAllArticles()
    }
}