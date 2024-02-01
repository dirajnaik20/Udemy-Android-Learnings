package com.example.androidlearning.presentation.di.movie

import com.example.androidlearning.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {

    fun inject(movieActivity: MovieActivity)
    @Subcomponent.Factory
    interface Factory{
         fun create(): MovieSubComponent
    }
}