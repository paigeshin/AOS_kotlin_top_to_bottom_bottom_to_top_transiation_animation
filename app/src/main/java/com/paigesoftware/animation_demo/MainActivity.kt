package com.paigesoftware.animation_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGo.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.bottom_slide_in, R.anim.bottom_slide_out)

        }


    }
}