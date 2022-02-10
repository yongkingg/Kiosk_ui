package com.example.kiosk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BeverageOrderPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backbtn_fragment)
        supportFragmentManager.beginTransaction().replace(R.id.mainlayout,BeverageOrderPageBody()).commit()
        var headText = findViewById<TextView>(R.id.textView)
        headText.setText("음료주문")
        initEvent()
    }
    fun initEvent(){
        var backBtn:Button? = findViewById<Button>(R.id.backBtn)
        backBtn!!.setOnClickListener{
            finish()
        }
    }
}
