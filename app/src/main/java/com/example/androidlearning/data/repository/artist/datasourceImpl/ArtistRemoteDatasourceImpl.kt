package com.example.androidlearning.data.repository.artist.datasourceImpl

import com.example.androidlearning.data.api.TMDBService
import com.example.androidlearning.data.model.artist.ArtistList
import com.example.androidlearning.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDatasourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDatasource {
    override suspend fun getArtists(): Response<ArtistList> {
        return tmdbService.getPopularArtists(apiKey)
    }
}