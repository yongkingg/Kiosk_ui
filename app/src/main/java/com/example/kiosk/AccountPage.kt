package com.example.kiosk

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class AccountPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backbtn_fragment)
        var headText = findViewById<TextView>(R.id.textView)
        var head = findViewById<ConstraintLayout>(R.id.linearLayout)
        headText.setText("로그인")
        supportFragmentManager.beginTransaction().replace(R.id.mainlayout,AccountPageBody()).commit()

    }
}
