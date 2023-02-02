package com.exampleK.learnKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOnClick = findViewById<Button>(R.id.btn1)
        val centerText  = findViewById<TextView>(R.id.textView1)
        var counter =  0
        buttonOnClick.setOnClickListener {
            counter += 1
            centerText.text = "You Clicked on button! ${counter.toString()}"
            Toast.makeText(this,"Hey Kotlin!",Toast.LENGTH_LONG).show()
        }
    }
}