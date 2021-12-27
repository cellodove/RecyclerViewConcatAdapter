package com.peter.recyclerviewconcatadapter.adapter.layoutadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.adapter.AddressAdapter
import com.peter.recyclerviewconcatadapter.databinding.AddressGridItemBinding

class GridAddressAdapter(private val context: Context, private val addressAdapter: AddressAdapter):RecyclerView.Adapter<GridAddressAdapter.GridViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val binding = AddressGridItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        binding.gridRecycler.layoutManager = GridLayoutManager(context,4)
        return GridViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bind(addressAdapter)
    }

    override fun getItemCount(): Int = 1

    inner class GridViewHolder(private val binding: AddressGridItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(addressAdapter: AddressAdapter){
            binding.gridRecycler.adapter = addressAdapter
        }
    }
}