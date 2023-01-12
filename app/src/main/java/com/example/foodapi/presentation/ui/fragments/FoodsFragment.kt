package com.example.foodapi.presentation.ui.fragments

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.foodapi.R
import com.example.foodapi.databinding.FragmentFoodsBinding
import com.example.foodapi.presentation.base.BaseFragment
import com.example.foodapi.presentation.ui.adapters.FoodsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodsFragment :
    BaseFragment<FragmentFoodsBinding, FoodsViewModel>(R.layout.fragment_foods) {

    override val binding by viewBinding(FragmentFoodsBinding::bind)
    override val viewModel: FoodsViewModel by viewModels()
    private var foodsAdapter = FoodsAdapter()

    override fun initialize() {
        binding.recyclerView.apply {
            adapter = foodsAdapter
        }
    }

    override fun setupSubscribes() {
        viewModel.getFoodsList().subscribe(
            onError = { error ->
                loge("TAG", error)
            },
            onSuccess = { data ->
                foodsAdapter.setupList(data)
            }
        )
    }

    fun Fragment.loge(tag: String, massage: String) = Log.e(tag, massage)
}