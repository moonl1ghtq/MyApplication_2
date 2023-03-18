package com.example.myapplication2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val qtext = intent.getStringExtra(MainActivity.CAT)
        val q = findViewById<TextView>(R.id.textView3)
        q.text = qtext

        val wtext = intent.getStringExtra(MainActivity.DOG)
        val w = findViewById<TextView>(R.id.textView7)
        w.text = wtext

        val etext = intent.getStringExtra(MainActivity.ELEPHANT)
        val e = findViewById<TextView>(R.id.textView8)
        e.text = etext
    }
}