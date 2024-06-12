package com.example.pr14bel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)
    }

    fun but1(view: View) {
        val intent = Intent(this, GeneralActivity::class.java)
        startActivity(intent)
    }

    fun but2(view: View) {
        val intent = Intent(this,AlarmActivity::class.java)
        startActivity(intent)
    }

    fun but3(view: View) {
        val intent = Intent(this,AddTascActivity::class.java)
        startActivity(intent)
    }

    fun but4(view: View) {
        val intent = Intent(this,EditAlarmActivity::class.java)
        startActivity(intent)
    }
}