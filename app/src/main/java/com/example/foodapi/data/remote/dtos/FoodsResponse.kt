package com.example.foodapi.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class FoodsResponse<T>(
    @SerializedName("results")
    val results: List<T>
)
