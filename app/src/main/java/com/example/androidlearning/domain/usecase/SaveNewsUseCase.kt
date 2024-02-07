package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.Article
import com.example.androidlearning.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.saveNews(article)
}