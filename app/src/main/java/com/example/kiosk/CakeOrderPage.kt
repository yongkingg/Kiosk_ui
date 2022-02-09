package com.example.kiosk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CakeOrderPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backbtn_fragment)
        supportFragmentManager.beginTransaction().replace(R.id.mainlayout,CakeOrderPageBody()).commit()
    }
}