package com.peter.recyclerviewconcatadapter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.peter.recyclerviewconcatadapter.databinding.AddressItemBinding
import com.peter.recyclerviewconcatadapter.model.Address

class AddressAdapter(private val clickItem: (Address) -> Unit ):ListAdapter<Address, AddressAdapter.AddressViewHolder>(diffUtil){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddressViewHolder {
        val binding = AddressItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        val addressViewHolder = AddressViewHolder(binding)
        binding.root.setOnClickListener {
            clickItem(getItem(addressViewHolder.layoutPosition))
        }
        return addressViewHolder
    }

    override fun onBindViewHolder(holder: AddressViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class AddressViewHolder(private val binding: AddressItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(address : Address){
            binding.addressName.text = address.addressName
            binding.addressNumber.text = address.addressNumber
        }
    }
    companion object{
        val diffUtil = object : DiffUtil.ItemCallback<Address>(){
            override fun areItemsTheSame(oldItem: Address, newItem: Address): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Address, newItem: Address): Boolean {
                return oldItem.addressName == newItem.addressName
            }
        }
    }
}