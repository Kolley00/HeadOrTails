package com.example.andrew.headsortailes
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    val mygameList = arrayListOf("It's Tails", "It's Heads")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button2.setOnClickListener{
            val random = java.util.Random()
            val randomProgram = random.nextInt(mygameList.count())

            textView2.text = mygameList[randomProgram]
        }
    }
}
