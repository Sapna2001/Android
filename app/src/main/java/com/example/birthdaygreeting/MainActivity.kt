package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
          val name = nameInput.editableText.toString()
//        Toast.makeText(this,"$name",Toast.LENGTH_LONG).show()
          val intent = Intent(this,BirthdayGreetingActivity::class.java) //go from one process to another
          intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
          startActivity(intent)
    }
}