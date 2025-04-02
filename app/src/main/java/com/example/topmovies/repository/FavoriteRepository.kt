package com.example.topmovies.repository

import com.example.topmovies.db.MovieEntity
import com.example.topmovies.db.MoviesDao
import javax.inject.Inject

class FavoriteRepository @Inject constructor(private val dao: MoviesDao) {
    fun allFavoriteList(): MutableList<MovieEntity> = dao.getAllMovies()
}