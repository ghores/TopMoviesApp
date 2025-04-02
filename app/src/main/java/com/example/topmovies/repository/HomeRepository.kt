package com.example.topmovies.repository

import com.example.topmovies.api.ApiServices
import com.example.topmovies.models.home.ResponseGenresList
import com.example.topmovies.models.home.ResponseMoviesList
import retrofit2.Response
import javax.inject.Inject

class HomeRepository @Inject constructor(private val api: ApiServices) {
    suspend fun moviesTopList(id: Int): Response<ResponseMoviesList> = api.moviesTopList(id)
    suspend fun genresList(): Response<ResponseGenresList> = api.genresList()
    suspend fun moviesLastList(): Response<ResponseMoviesList> = api.moviesLastList()
}