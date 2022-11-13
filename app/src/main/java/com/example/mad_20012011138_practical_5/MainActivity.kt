package com.example.mad_20012011138_Practical_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.mad_20012011138_practical_5.MyService
import com.example.mad_20012011138_practical_5.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun play(view: View) {
        Intent(applicationContext, MyService::class.java)
            .putExtra(MyService.DATA_KEY, MyService.DATA_VALUE)
            .apply {
                startService(this)
            }
        Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
    }

    fun stop(view: View) {
        Intent(applicationContext, MyService::class.java)
            .apply {
                stopService(this)
            }
        Toast.makeText(this, "button is clicked", Toast.LENGTH_LONG).show()
    }

}