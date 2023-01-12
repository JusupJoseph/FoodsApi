package com.example.foodapi.data.remote.dtos

import com.example.foodapi.domain.models.FoodsModel
import com.google.gson.annotations.SerializedName

data class FoodsDtoItem(
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: Int
)

fun FoodsDtoItem.toDomain() = FoodsModel(
    name = name,
    price = price
)