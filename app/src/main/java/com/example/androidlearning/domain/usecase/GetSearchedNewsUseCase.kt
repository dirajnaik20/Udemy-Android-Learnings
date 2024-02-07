package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.APIResponse
import com.example.androidlearning.data.util.Resource
import com.example.androidlearning.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery:String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}