package com.example.androidlearning.data.repository.artist.datasourceImpl

import com.example.androidlearning.data.db.ArtistDao
import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.data.repository.artist.datasource.ArtistLocalDatasource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDatasourceImpl(private val artistDao: ArtistDao):ArtistLocalDatasource {
    override suspend fun getArtistFromDB(): List<Artist> {
       return artistDao.getAllArtists()
    }

    override suspend fun saveArtistToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.deleteAllArtists()
        }
    }
}