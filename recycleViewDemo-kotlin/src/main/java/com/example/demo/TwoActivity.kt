package com.example.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.demo2.R
import kotlinx.android.synthetic.main.activity_two.*

class TwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        tv.text=intent.getIntExtra("position",-1).toString()
    }
}
