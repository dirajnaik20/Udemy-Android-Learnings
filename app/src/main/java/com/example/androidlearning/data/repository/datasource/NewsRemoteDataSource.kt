package com.example.androidlearning.data.repository.datasource

import com.example.androidlearning.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country:String,page:Int):Response<APIResponse>
}