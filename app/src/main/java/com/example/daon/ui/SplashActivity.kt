package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.daon.R
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        moveToNextActivity()
    }

    private fun moveToNextActivity() {
        val handler = Handler()
        handler.postDelayed({
            startActivity<SelectLanguageActivity>()
            finish()
        }, 1000)
    }
}
