package com.peter.recyclerviewconcatadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.databinding.UserItemBinding
import com.peter.recyclerviewconcatadapter.model.User

class UserAdapter(private val itemClick: (User) -> Unit):ListAdapter<User,UserAdapter.UserViewHolder>(diffUtil){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val userViewHolder = UserViewHolder(binding)
        binding.apply {
            root.setOnClickListener {
                itemClick(getItem(userViewHolder.bindingAdapterPosition))
            }
        }
        return userViewHolder
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
    inner class UserViewHolder(private val binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(user: User){
            binding.userName.text = user.name
            binding.userImage.setImageResource(user.image)
            binding.userAge.text = user.age
        }
    }
    companion object{
        val diffUtil = object  : DiffUtil.ItemCallback<User>(){
            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
                return  oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem.name == newItem.name
            }
        }
    }
}