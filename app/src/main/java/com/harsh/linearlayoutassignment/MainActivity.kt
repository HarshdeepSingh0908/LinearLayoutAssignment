package com.harsh.linearlayoutassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var collegeEditText: EditText
    private lateinit var aboutCollegeEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.nameEditText)
        collegeEditText = findViewById(R.id.collegeEditText)
        aboutCollegeEditText = findViewById(R.id.aboutCollegeEditText)

        val submitButton: Button = findViewById(R.id.submitButton)
        submitButton.setOnClickListener {
            submitForm()
        }
    }

    private fun submitForm() {
        val name = nameEditText.text.toString()
        val collegeName = collegeEditText.text.toString()
        val aboutCollege = aboutCollegeEditText.text.toString()


        if (name.isEmpty() || collegeName.isEmpty() || aboutCollege.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            return
        }

        Toast.makeText(this, "Name: $name\nCollege Name: $collegeName\nAbout College: $aboutCollege", Toast.LENGTH_LONG).show()
    }
}