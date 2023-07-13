package com.example.uasmobile2.Service

import com.example.uasmobile2.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=164016be981f3078a10b37cc8e38f6a0")
    fun getMovieList(): Call<MovieResponse>
}