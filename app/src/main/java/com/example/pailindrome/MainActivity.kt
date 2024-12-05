package com.example.pailindrome

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val text=findViewById<EditText>(R.id.editTextText2)
        val check=findViewById<Button>(R.id.button2)

        check.setOnClickListener {

            val textC=text.text.toString()
            if(ispalindrome(textC)){
                Toast.makeText(this, "text is palindrome", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Text is not palindrome", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun ispalindrome(textC: String):Boolean{
        val reverseString=textC.reversed().toString()
        return textC.equals(reverseString, ignoreCase = true)

    }
}