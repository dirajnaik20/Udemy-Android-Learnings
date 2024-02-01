package com.example.androidlearning.data.repository.tvshow.datasourceImpl

import com.example.androidlearning.data.api.TMDBService
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.data.model.tvshow.TvShowList
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDatasourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDatasource {
    override suspend fun getTvShows(): Response<TvShowList> {
        return tmdbService.getPopularTvShows(apiKey)
    }
}