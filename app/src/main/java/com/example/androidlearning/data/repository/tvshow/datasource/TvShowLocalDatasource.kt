package com.example.androidlearning.data.repository.tvshow.datasource

import com.example.androidlearning.data.model.tvshow.TvShow

interface TvShowLocalDatasource {

    suspend fun getTvShowsFromDB():List<TvShow>
    suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
    suspend fun clearAll()
}