package com.example.androidlearning.data.repository.datasourceImpl

import com.example.androidlearning.data.api.NewsAPIService
import com.example.androidlearning.data.model.APIResponse
import com.example.androidlearning.data.repository.datasource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService
):NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country:String,page:Int): Response<APIResponse> {
        return newsAPIService.getTopNewsHeadlines(country,page)
    }
}