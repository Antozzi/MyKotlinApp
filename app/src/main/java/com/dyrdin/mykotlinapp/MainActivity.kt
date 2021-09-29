package com.dyrdin.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.pushme_button)
        val helloWorld = findViewById<TextView>(R.id.hello_world)

        button.setOnClickListener {
            helloWorld.text = getString(R.string.button_pushed)
        }



    }
}