package com.example.androidlearning.data.repository.tvshow.datasourceImpl

import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowCacheDatasource
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowRemoteDatasource

class TvshowCacheDatasourceImpl: TvShowCacheDatasource {

    private lateinit var tvShowList:ArrayList<TvShow>
    override suspend fun getTvShowsFromCache(): List<TvShow> {
        return tvShowList
    }

    override suspend fun saveTvShowsToCache(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList=ArrayList(tvShows)
    }
}