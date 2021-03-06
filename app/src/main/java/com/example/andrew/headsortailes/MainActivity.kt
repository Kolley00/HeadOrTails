package com.example.andrew.headsortailes

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button4.setOnClickListener{
            val  intent = Intent(this, SecondActivity::class.java)
              startActivity(intent)
        }
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello My Friend, Please Start The Game", Toast.LENGTH_SHORT)
        myToast.show()
    }

}
