package com.example.androidlearning.data.repository.artist.datasource

import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistCacheDatasource {
    suspend fun getArtistFromCache():List<Artist>
    suspend fun saveArtistToCache(artists:List<Artist>)

}