package com.peter.recyclerviewconcatadapter

import com.peter.recyclerviewconcatadapter.model.Address
import com.peter.recyclerviewconcatadapter.model.Department
import com.peter.recyclerviewconcatadapter.model.User

object DataSource {

    fun getUser() = ArrayList<User>().apply {
        add(User("홍길동",R.drawable.grandfather1_icon,"50"))
        add(User("배추도사",R.drawable.grandfather2_icon,"70"))
        add(User("깔끔이",R.drawable.dentist_icon,"25"))
        add(User("홍길순",R.drawable.grandmother1_icon,"51"))
        add(User("한여름",R.drawable.grandmother2_icon,"45"))
        add(User("상남자",R.drawable.man1_icon,"21"))
        add(User("호크아이",R.drawable.man2_icon,"30"))
        add(User("스타크",R.drawable.scientist_icon,"35"))
        add(User("블랙위도우",R.drawable.woman1_icon,"29"))
        add(User("이세경",R.drawable.woman2_icon,"21"))
        add(User("백세나",R.drawable.woman3_icon,"28"))
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
        add(Address("홍길동 연구실","010-4568-5678"))
        add(Address("상황실","010-7514-4984"))
        add(Address("방재실","010-1238-9432"))
        add(Address("위원회","010-1646-5678"))
        add(Address("대학원","010-7945-8471"))
        add(Address("총장실","010-9354-1205"))
        add(Address("부총장실","010-7802-7912"))
        add(Address("이사장","010-9843-0135"))
        add(Address("방송부","010-5842-9145"))


    }
}