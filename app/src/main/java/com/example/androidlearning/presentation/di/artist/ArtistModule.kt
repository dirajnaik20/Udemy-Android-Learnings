package com.example.androidlearning.presentation.di.artist

import com.example.androidlearning.domain.usecase.GetArtistsUseCase
import com.example.androidlearning.domain.usecase.UpdateArtistsUseCase
import com.example.androidlearning.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun providerArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }
}