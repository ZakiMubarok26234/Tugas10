package com.zaki.aplikasimovie

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {


    @GET("/3/movie/popular?api_key=52325e69cbba0efa5f665450317e7a71")
    fun getMovieList(): Call<MovieResponse>
}