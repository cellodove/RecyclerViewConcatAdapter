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
        add(Department(R.drawable.machine_icon,"기계공학"))
        add(Department(R.drawable.chemistry_icon,"화학공학"))
        add(Department(R.drawable.computer_icon,"컴퓨터공학"))
        add(Department(R.drawable.doctor_icon,"의학"))
        add(Department(R.drawable.electricity_icon,"전기전자"))
        add(Department(R.drawable.english_icon,"영어영문"))
        add(Department(R.drawable.management_icon,"경영학"))
        add(Department(R.drawable.nurse_icon,"간호학"))
        add(Department(R.drawable.psychology_icon,"심리학"))
    }

    fun getAddress() = ArrayList<Address>().apply {
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))
        add(Address("학과사무실","010-1234-5678"))

    }
}