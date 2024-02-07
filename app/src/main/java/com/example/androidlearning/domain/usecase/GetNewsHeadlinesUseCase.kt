package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.APIResponse
import com.example.androidlearning.data.util.Resource
import com.example.androidlearning.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country:String,page:Int): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines(country,page)
    }
}