package com.peter.recyclerviewconcatadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.databinding.DepartmentItemBinding
import com.peter.recyclerviewconcatadapter.model.Department

class DepartmentAdapter(private val depart : ArrayList<Department>):RecyclerView.Adapter<DepartmentAdapter.DepartViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartViewHolder {
        val binding = DepartmentItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DepartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DepartViewHolder, position: Int) {
        holder.bind(depart[position])
    }

    override fun getItemCount(): Int {
        return depart.size
    }

    inner class DepartViewHolder(private val binding: DepartmentItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(depart:Department){
            binding.departName.text = depart.departName
            binding.departImage.setImageResource(depart.departImage)
        }
    }
}