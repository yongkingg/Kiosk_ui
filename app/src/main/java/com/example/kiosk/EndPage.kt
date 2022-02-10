package com.example.kiosk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EndPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menubtn_fragment)
        supportFragmentManager.beginTransaction().replace(R.id.mainlayout,EndPageBody()).commit()
    }
}
