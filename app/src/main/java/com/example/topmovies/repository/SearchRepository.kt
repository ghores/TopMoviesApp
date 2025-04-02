package com.example.topmovies.repository

import com.example.topmovies.api.ApiServices
import com.example.topmovies.models.home.ResponseMoviesList
import retrofit2.Response
import javax.inject.Inject

class SearchRepository @Inject constructor(private val api: ApiServices) {
    suspend fun searchMovie(name: String): Response<ResponseMoviesList> = api.searchMovies(name)
}