package com.peter.recyclerviewconcatadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.databinding.AddressItemBinding
import com.peter.recyclerviewconcatadapter.model.Address

class AddressAdapter(private val address: ArrayList<Address>):RecyclerView.Adapter<AddressAdapter.AddressViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressViewHolder {
        val binding = AddressItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AddressViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AddressViewHolder, position: Int) {
        holder.bind(address[position])
    }

    override fun getItemCount(): Int {
        return  address.size
    }

    inner class AddressViewHolder(private val binding: AddressItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(address : Address){
            binding.addressName.text = address.addressName
            binding.addressNumber.text = address.addressNumber
        }
    }
}