package com.example.pr14bel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AddTascActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_tasc)
    }

    fun but1(view: View) {
        val intent = Intent(this,GeneralActivity::class.java)
        startActivity(intent)
    }

    fun but5(view: View) {
        finish();
    }
}