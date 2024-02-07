package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.Article
import com.example.androidlearning.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}