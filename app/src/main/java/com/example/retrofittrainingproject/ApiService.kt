package com.example.retrofittrainingproject

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {

    @GET
    suspend fun getDogsBreeds(@Url url: String): Response<DogResponse>
}