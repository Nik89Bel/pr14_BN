package com.example.pr14bel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EditAlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_alarm)
    }

    fun but2(view: View) {
        val intent = Intent(this, AlarmActivity::class.java)
        startActivity(intent)
    }

    fun but5(view: View) {
        finish();
    }
}