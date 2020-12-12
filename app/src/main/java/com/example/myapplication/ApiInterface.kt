package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {


    @GET("popular?api_key=832f13a97b5d2df50ecf0dbc8a0f46ae&query=star+wars&page=1")
    fun getMovies(): Call<MoviesModel>
}
