package com.belajar.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // finding the button
        val showButton = findViewById<Button>(R.id.showInput)

        // finding the edit text
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)


        // Setting On Click Listener
        showButton.setOnClickListener {

            // Getting the user input
            val text1 = editText1.text
            val text2 = editText2.text

            // Showing the user input
            Toast.makeText(this, text1, Toast.LENGTH_SHORT).show()

        }
    }
}