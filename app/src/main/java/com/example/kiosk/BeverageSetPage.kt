package com.example.kiosk

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BeverageSetPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backbtn_fragment)
        supportFragmentManager.beginTransaction().replace(R.id.mainlayout,BeverageSetPageBody()).commit()
        initEvent()
    }

    fun initEvent(){
        var backBtn: Button? = findViewById<Button>(R.id.backBtn)
        backBtn!!.setOnClickListener{
            finish()
            }

    }
}

