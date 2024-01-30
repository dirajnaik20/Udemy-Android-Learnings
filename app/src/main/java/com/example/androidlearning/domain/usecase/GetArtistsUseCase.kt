package com.example.androidlearning.domain.usecase

import com.example.androidlearning.data.model.artist.Artist
import com.example.androidlearning.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>?=artistRepository.getArtists()
}