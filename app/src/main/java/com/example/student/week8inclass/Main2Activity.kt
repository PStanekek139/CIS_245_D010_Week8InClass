package com.example.student.week8inclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtshow = findViewById<TextView>(R.id.txtShow)

        //load intent string from MainActivity.kt

        var strShow: String = intent.getStringExtra("SendStuff")
        txtshow.text = strShow
    }
}
