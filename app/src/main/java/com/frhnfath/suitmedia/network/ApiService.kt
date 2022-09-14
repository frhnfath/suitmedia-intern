package com.frhnfath.suitmedia.network

import com.frhnfath.suitmedia.data.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("api/users/")
    suspend fun getAllUsers():Response

    @GET("api/users/{id}")
    fun getUser(
        @Path("id") id: String
    ): Call<Response>
}