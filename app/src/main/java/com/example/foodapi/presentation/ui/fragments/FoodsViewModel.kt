package com.example.foodapi.presentation.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.foodapi.domain.usecases.GetFoodsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FoodsViewModel @Inject constructor(
    private val getFoodsUseCase: GetFoodsListUseCase
) : ViewModel() {

    fun getFoodsList() = getFoodsUseCase.invoke()
}