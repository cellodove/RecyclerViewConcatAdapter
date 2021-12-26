package com.peter.recyclerviewconcatadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.peter.recyclerviewconcatadapter.adapter.AddressAdapter
import com.peter.recyclerviewconcatadapter.adapter.DepartmentAdapter
import com.peter.recyclerviewconcatadapter.adapter.UserAdapter
import com.peter.recyclerviewconcatadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ConcatAdapter
    lateinit var userAdapter: UserAdapter
    lateinit var departAdapter:DepartmentAdapter
    lateinit var addressAdapter: AddressAdapter
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setConcatRecycler()
    }

    private fun setConcatRecycler() {
        userAdapter = UserAdapter(DataSource.getUser())
        departAdapter = DepartmentAdapter(DataSource.getDepartment())
        addressAdapter = AddressAdapter(DataSource.getAddress())
        val listOfAdapter = listOf(departAdapter,userAdapter,addressAdapter)
        adapter = ConcatAdapter(listOfAdapter)
        binding.recyclerView.adapter = adapter

    }
}