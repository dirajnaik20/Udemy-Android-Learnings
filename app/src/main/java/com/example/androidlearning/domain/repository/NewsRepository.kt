package com.example.androidlearning.domain.repository


import com.example.androidlearning.data.model.APIResponse
import com.example.androidlearning.data.model.Article
import com.example.androidlearning.data.util.Resource
import kotlinx.coroutines.flow.Flow


interface NewsRepository {

    suspend fun getNewsHeadlines(country:String,page:Int):Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery:String):Resource<APIResponse>
    fun saveNews(article: Article)
    fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}