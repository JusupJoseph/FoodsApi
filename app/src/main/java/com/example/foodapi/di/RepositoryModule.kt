package com.example.foodapi.di

import com.example.foodapi.data.repositories.FoodsRepositoryImpl
import com.example.foodapi.domain.repositories.FoodsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindFoodsRepositories(foodsRepositories: FoodsRepositoryImpl): FoodsRepository
}