package com.example.student.week8inclass
//Paul Stanek
//CIS-245-D010
//Week 8 In-Class Assignment
//2/26/2018



import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind objects
        val btngo = findViewById<Button>(R.id.btnPage2)
        val txtsend = findViewById<EditText>(R.id.txtSend)

        btngo.setOnClickListener(View.OnClickListener {
            //Intent is used to send data between activities
            val intent = Intent(this, Main2Activity::class.java)
            //putExtra sets value to name SendStuff
            intent.putExtra("SendStuff", txtsend.text.toString())
            //Go to second activity
            startActivity(intent)
        })
    }


}
