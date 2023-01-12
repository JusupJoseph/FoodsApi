package com.example.foodapi.domain.usecases

import com.example.foodapi.domain.repositories.FoodsRepository
import javax.inject.Inject

class GetFoodsListUseCase @Inject constructor(
    private val foodsRepository: FoodsRepository
) {
    fun invoke() = foodsRepository.getFoodsList()
}