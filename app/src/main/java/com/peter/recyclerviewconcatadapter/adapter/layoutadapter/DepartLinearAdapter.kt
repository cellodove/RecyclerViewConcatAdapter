package com.peter.recyclerviewconcatadapter.adapter.layoutadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.adapter.DepartmentAdapter
import com.peter.recyclerviewconcatadapter.databinding.DepartLinearItemBinding

class DepartLinearAdapter(private val context: Context, private val departmentAdapter: DepartmentAdapter):RecyclerView.Adapter<DepartLinearAdapter.LinearViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        val binding = DepartLinearItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        binding.linearRecycler.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        return LinearViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {
        holder.bind(departmentAdapter)
    }

    override fun getItemCount(): Int = 1

    inner class LinearViewHolder(private val binding: DepartLinearItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(departmentAdapter : DepartmentAdapter) {
            binding.linearRecycler.adapter = departmentAdapter
        }
    }
}