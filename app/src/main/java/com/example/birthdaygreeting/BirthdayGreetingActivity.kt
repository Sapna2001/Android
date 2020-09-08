package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

//        createBirthdayButton.setOnClickListener {
//            val name = nameInput.editableText.toString()
//             Toast.makeText(this, "$name",Toast.LENGTH_LONG).show()
//        }
    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()
        Toast.makeText(this, "$name",Toast.LENGTH_LONG).show()
    }
}

