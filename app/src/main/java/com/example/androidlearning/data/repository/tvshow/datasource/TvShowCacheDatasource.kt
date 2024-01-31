package com.example.androidlearning.data.repository.tvshow.datasource

import com.example.androidlearning.data.model.tvshow.TvShow

interface TvShowCacheDatasource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)
}