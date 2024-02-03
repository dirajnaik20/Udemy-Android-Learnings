package com.example.androidlearning.data.repository.tvshow

import android.util.Log
import com.example.androidlearning.data.model.tvshow.TvShow
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowCacheDatasource
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowLocalDatasource
import com.example.androidlearning.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.androidlearning.domain.repository.TvShowRepository

class TvShowRepositoryImpl(
    private val tvShowRemoteDatasource: TvShowRemoteDatasource,
    private val tvShowLocalDatasource: TvShowLocalDatasource,
    private val tvShowCacheDatasource: TvShowCacheDatasource
) : TvShowRepository {
    override suspend fun getTvShows(): List<TvShow>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateTvShows(): List<TvShow>? {
        val newListOfTvShow=getTvShowsFromAPI()

        tvShowLocalDatasource.clearAll()
        tvShowLocalDatasource.saveTvShowsToDB(newListOfTvShow)
        tvShowCacheDatasource.saveTvShowsToCache(newListOfTvShow)
        return newListOfTvShow
    }

    suspend fun getTvShowsFromAPI(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            val response =tvShowRemoteDatasource.getTvShows()
            val body=response.body()
            if (body!=null){
                tvShowList=body.tvShows
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return tvShowList
    }
    suspend fun getTvShowsFromDB(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            tvShowList=getTvShowsFromAPI()

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (tvShowList.size>0){
            return tvShowList
        }
        else{
            tvShowList=getTvShowsFromAPI()
            tvShowLocalDatasource.saveTvShowsToDB(tvShowList)

        }
        return tvShowList
    }

    suspend fun getTvShowsFromCache(): List<TvShow> {
        lateinit var tvShowList: List<TvShow>
        try {
            tvShowList=getTvShowsFromDB()

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if (tvShowList.size>0){
            return tvShowList
        }
        else{
            tvShowList=getTvShowsFromDB()
            tvShowCacheDatasource.saveTvShowsToCache(tvShowList)

        }
        return tvShowList
    }

}