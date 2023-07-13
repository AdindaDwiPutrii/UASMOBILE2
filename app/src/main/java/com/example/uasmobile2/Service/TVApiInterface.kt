package com.example.uasmobile2.Service

import com.example.uasmobile2.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=164016be981f3078a10b37cc8e38f6a0")
    fun getTVList(): Call<TVResponse>
}