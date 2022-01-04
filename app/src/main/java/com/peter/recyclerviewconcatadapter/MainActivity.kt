package com.peter.recyclerviewconcatadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.ConcatAdapter
import com.peter.recyclerviewconcatadapter.adapter.*
import com.peter.recyclerviewconcatadapter.adapter.layoutadapter.DepartLinearAdapter
import com.peter.recyclerviewconcatadapter.adapter.layoutadapter.GridAddressAdapter
import com.peter.recyclerviewconcatadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ConcatAdapter
    lateinit var userAdapter: UserAdapter
    lateinit var departAdapter:DepartmentAdapter
    lateinit var addressAdapter: AddressAdapter

    lateinit var departLinearAdapter: DepartLinearAdapter
    lateinit var gridAddressAdapter: GridAddressAdapter
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setConcatRecycler()
    }

    private fun setConcatRecycler() {
        userAdapter = UserAdapter{ user ->
            Toast.makeText(this,"${user.name} , ${user.age}", Toast.LENGTH_SHORT).show()
        }
        userAdapter.submitList(DataSource.getUser())

        departAdapter = DepartmentAdapter{ department ->
            Toast.makeText(this,"${department.departName}", Toast.LENGTH_SHORT).show()
        }
        departAdapter.submitList(DataSource.getDepartment())
        departLinearAdapter = DepartLinearAdapter(this,departAdapter)


        addressAdapter = AddressAdapter{ address ->
            Toast.makeText(this,"${address.addressName} , ${address.addressNumber}", Toast.LENGTH_SHORT).show()
        }
        addressAdapter.submitList(DataSource.getAddress())
        gridAddressAdapter = GridAddressAdapter(this,addressAdapter)

        val listOfAdapter = listOf(departLinearAdapter,userAdapter,gridAddressAdapter)
        adapter = ConcatAdapter(listOfAdapter)
        binding.recyclerView.adapter = adapter
    }
}