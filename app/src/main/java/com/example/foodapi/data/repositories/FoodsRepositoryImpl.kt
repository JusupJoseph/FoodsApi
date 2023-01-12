package com.example.foodapi.data.repositories

import com.example.foodapi.data.base.BaseRepository
import com.example.foodapi.data.remote.api.FoodsApiService
import com.example.foodapi.data.remote.dtos.toDomain
import com.example.foodapi.domain.repositories.FoodsRepository
import javax.inject.Inject

class FoodsRepositoryImpl @Inject constructor(
    private val foodsApi: FoodsApiService
) : BaseRepository(), FoodsRepository {

    override fun getFoodsList() = doRequest {
        foodsApi.fetchFoods().results.map {
            it.toDomain()
        }
    }
}