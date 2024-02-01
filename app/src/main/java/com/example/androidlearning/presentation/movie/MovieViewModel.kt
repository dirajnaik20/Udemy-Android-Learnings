package com.example.androidlearning.presentation.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.androidlearning.data.model.movie.Movie
import com.example.androidlearning.domain.usecase.GetMoviesUseCase
import com.example.androidlearning.domain.usecase.UpdateMoviesUseCase



class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModel() {

    fun getMovies()= liveData {
        val movieList=getMoviesUseCase.execute()
        emit(movieList)
    }
    fun updateMovies()= liveData {
        val movieList=updateMoviesUseCase.execute()
        emit(movieList)
    }

}