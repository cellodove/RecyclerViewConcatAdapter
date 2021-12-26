package com.peter.recyclerviewconcatadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.databinding.UserItemBinding
import com.peter.recyclerviewconcatadapter.model.User

class UserAdapter(private val users: ArrayList<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int {
        return users.size
    }

    inner class UserViewHolder(private val binding: UserItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(user: User){
            binding.userName.text = user.name
            binding.userImage.setImageResource(user.image)
            binding.userAge.text = user.age
        }
    }
}