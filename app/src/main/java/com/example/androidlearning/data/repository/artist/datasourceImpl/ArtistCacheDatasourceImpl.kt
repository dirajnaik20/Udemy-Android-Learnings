package com.example.androidlearning.data.repository.artist.datasourceImpl

import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.model.artist.ArtistList
import com.example.androidlearning.data.repository.artist.datasource.ArtistCacheDatasource

class ArtistCacheDatasourceImpl:ArtistCacheDatasource{

    private var artistList= ArrayList<Artist>()
    override suspend fun getArtistFromCache(): List<Artist> {
        return artistList
    }

    override suspend fun saveArtistToCache(artists: List<Artist>) {
        artistList.clear()
        artistList=ArrayList(artists)
    }
}