package com.example.exampractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Pattern 2 = variables
        val lives = 3
        var score = 0
        score = 10

        var age: Int = 20
        var name: String = "Jesse"



        textView.text = "Hello $name, your score is $score
        textView.text = "Double your score" ${score * 2}"
        textView.text = "Next question: ${currentIndex + 1} of ${questions.count()}"

        //grab a TextView
        val myTextView = findViewById<TextView>(R.id.myTextView)

        //grab a button
        val myButton = findViewById<Button>(R.id.myButton)

        //grab an editText
        val myEditText = findViewById<EditText>(R.id.myEditText)

        //Button Listener
        myButton.setOnClickListener {
            //everything that runs when button is clicked
            myTextView.Text = "Button was clicked"
        }
        //get text as a string
        val userInput = myEditText.text.toString()

        //get text as an Int (when user enters a number)
        val userNumber = myEditText.text.toString().toInt()


















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}