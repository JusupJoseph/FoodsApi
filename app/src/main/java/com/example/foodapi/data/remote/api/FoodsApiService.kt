package com.example.foodapi.data.remote.api

import com.example.foodapi.data.remote.dtos.FoodsDtoItem
import com.example.foodapi.data.remote.dtos.FoodsResponse
import retrofit2.http.GET
import retrofit2.http.Header

interface FoodsApiService {
    @GET("beverages")
    suspend fun fetchFoods(
        @Header("X-RapidAPI-Key") key: String = "7ea92f044amsh7e6b1ceff72cebfp1474c4jsn25abcdd13440",
        @Header("X-RapidAPI-Host") key1: String = "beverages-and-desserts.p.rapidapi.com"
    ): FoodsResponse<FoodsDtoItem>
}