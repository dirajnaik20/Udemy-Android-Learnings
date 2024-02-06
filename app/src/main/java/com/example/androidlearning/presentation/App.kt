package com.example.androidlearning.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App:Application() {
//    private lateinit var appComponent: AppComponent
//
//    override fun onCreate() {
//        super.onCreate()
//        appComponent=DaggerAppComponent.builder()
//            .appModule(AppModule(applicationContext))
//            .netModule(NetModule(BuildConfig.BASE_URL))
//            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
//            .build()
//
//
//    }
//    override fun createMovieSubComponent(): MovieSubComponent {
//        return appComponent.movieSubComponent().create()
//    }
//
//    override fun createTvShowSubComponent(): TvShowSubComponent {
//        return appComponent.tvShowSubComponent().create()
//    }
//
//    override fun createArtistSubComponent(): ArtistSubComponent {
//        return appComponent.artistSubComponent().create()
//    }
}