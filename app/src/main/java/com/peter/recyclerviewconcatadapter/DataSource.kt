package com.peter.recyclerviewconcatadapter

import com.peter.recyclerviewconcatadapter.model.Address
import com.peter.recyclerviewconcatadapter.model.Department
import com.peter.recyclerviewconcatadapter.model.User

object DataSource {

    fun getUser() = ArrayList<User>().apply {
        add(User("홍길동",R.drawable.ic_launcher_background,"20"))
        add(User("홍길동",R.drawable.ic_launcher_background,"20"))
        add(User("홍길동",R.drawable.ic_launcher_background,"20"))
        add(User("홍길동",R.drawable.ic_launcher_background,"20"))
        add(User("홍길동",R.drawable.ic_launcher_background,"20"))
        add(User("홍길동",R.drawable.ic_launcher_background,"20"))

    }

    fun getDepartment() = ArrayList<Department>().apply {
        add(Department(R.drawable.ic_launcher_background,"기계공학부"))
        add(Department(R.drawable.ic_launcher_background,"기계공학부"))
        add(Department(R.drawable.ic_launcher_background,"기계공학부"))
        add(Department(R.drawable.ic_launcher_background,"기계공학부"))
        add(Department(R.drawable.ic_launcher_background,"기계공학부"))

    }

    fun getAddress() = ArrayList<Address>().apply {
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))
    }
}