package com.example.androidlearning.data.repository.tvshow.datasource

import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {

    suspend fun getTvShows():Response<TvShowList>
}