package com.example.topmovies.repository


import com.example.topmovies.api.ApiServices
import com.example.topmovies.db.MovieEntity
import com.example.topmovies.db.MoviesDao
import com.example.topmovies.models.detail.ResponseDetail
import retrofit2.Response
import javax.inject.Inject

class DetailRepository @Inject constructor(
    private val api: ApiServices,
    private val dao: MoviesDao
) {
    //Api
    suspend fun detailMovie(id: Int): Response<ResponseDetail> = api.detailMovie(id)

    //Database
    suspend fun insertMovie(entity: MovieEntity): Unit = dao.insertMovie(entity)
    suspend fun deleteMovie(entity: MovieEntity): Unit = dao.deleteMovie(entity)
    suspend fun existsMovie(id: Int): Boolean = dao.existsMovie(id)
}