package com.example.foodapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapi.databinding.ItemFoodListBinding
import com.example.foodapi.domain.models.FoodsModel

class FoodsAdapter :
    RecyclerView.Adapter<FoodsAdapter.ViewHolder>() {

    private var list: List<FoodsModel> = ArrayList()

    fun setupList(list: List<FoodsModel>) {
        this.list = list
    }

    class ViewHolder(private val binding: ItemFoodListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(pokemonModel: FoodsModel) {
            binding.priceFood.text = pokemonModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFoodListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}