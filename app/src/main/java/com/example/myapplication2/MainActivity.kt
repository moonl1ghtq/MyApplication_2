package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra(
                CAT, inf.info



            )
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra(DOG, inf1.info1

                    )
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra(
                ELEPHANT, inf2.info2
            )
            startActivity(intent)
        }




        with(binding) {
            //val newText = "qwerty"


            //binding.button.setOnClickListener {
            //binding.textView1.text = newText
            //}
        }
    }

    companion object {
        val CAT = "Cat"
        val DOG = "Dog"
        val ELEPHANT = "Elephant"


    }
}
