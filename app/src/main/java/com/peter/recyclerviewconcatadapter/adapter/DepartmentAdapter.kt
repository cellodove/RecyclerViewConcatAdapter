package com.peter.recyclerviewconcatadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.databinding.DepartmentItemBinding
import com.peter.recyclerviewconcatadapter.model.Department

class DepartmentAdapter(private val clickItem: (Department) -> Unit ):ListAdapter<Department, DepartmentAdapter.DepartViewHolder>(diffUtil) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartViewHolder {
        val binding = DepartmentItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val departViewHolder = DepartViewHolder(binding)
        binding.root.setOnClickListener {
            clickItem(getItem(departViewHolder.bindingAdapterPosition))
        }
        return departViewHolder
    }

    override fun onBindViewHolder(holder: DepartViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class DepartViewHolder(private val binding: DepartmentItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(depart:Department){
            binding.departName.text = depart.departName
            binding.departImage.setImageResource(depart.departImage)
        }
    }
    companion object{
        val diffUtil = object : DiffUtil.ItemCallback<Department>(){
            override fun areItemsTheSame(oldItem: Department, newItem: Department): Boolean {
                return newItem == oldItem
            }

            override fun areContentsTheSame(oldItem: Department, newItem: Department): Boolean {
                return  oldItem.departName == newItem.departName
            }
        }
    }
}