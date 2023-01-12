package com.example.foodapi.domain.repositories

import com.example.foodapi.common.either.Either
import com.example.foodapi.domain.models.FoodsModel
import kotlinx.coroutines.flow.Flow

interface FoodsRepository {
    fun getFoodsList(): Flow<Either<String, List<FoodsModel>>>
}