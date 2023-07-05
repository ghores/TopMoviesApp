package com.example.topmovies.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.topmovies.models.home.ResponseMoviesList
import com.example.topmovies.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository) : ViewModel() {

    val topMoviesList = MutableLiveData<ResponseMoviesList>()

    fun loadTopMoviesList(id: Int) = viewModelScope.launch {
        val response = repository.moviesTopList(id)
        if (response.isSuccessful) {
            topMoviesList.postValue(response.body())
        }
    }
}