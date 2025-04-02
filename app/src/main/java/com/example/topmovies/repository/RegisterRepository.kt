package com.example.topmovies.repository

import com.example.topmovies.api.ApiServices
import com.example.topmovies.models.register.BodyRegister
import com.example.topmovies.models.register.ResponseRegister
import retrofit2.Response
import javax.inject.Inject

class RegisterRepository @Inject constructor(private val api: ApiServices) {
    suspend fun registerUser(body: BodyRegister): Response<ResponseRegister> = api.registerUser(body)
}