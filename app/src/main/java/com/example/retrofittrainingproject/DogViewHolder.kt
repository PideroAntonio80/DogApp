package com.example.retrofittrainingproject

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofittrainingproject.databinding.ItemDogBinding

class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image: String) {
        Glide.with(binding.ivDogPicture.context).load(image).into(binding.ivDogPicture)
    }
}