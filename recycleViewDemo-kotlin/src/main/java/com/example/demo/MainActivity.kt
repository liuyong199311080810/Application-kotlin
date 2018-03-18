package com.example.demo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.demo2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), StudentAdapter.OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list= arrayListOf<Student>()
        list.add(Student("ly", 1, "123"))
        list.add(Student("ly", 2, "3432"))
        list.add(Student("ly", 3, "333"))
        list.add(Student("hy", 4, "33"))
        list.add(Student("hy", 5, "42"))
        recycler_view.adapter= StudentAdapter(list, this)
        recycler_view.layoutManager=LinearLayoutManager(this)
    }

    override fun onItemClick(itemView: View?, index: Int) {
        val intent= Intent(this@MainActivity, TwoActivity::class.java)
        intent.putExtra("position",index)
        startActivity(intent)
    }

}
