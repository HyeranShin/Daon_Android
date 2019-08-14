package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import kotlinx.android.synthetic.main.activity_select_language.*
import org.jetbrains.anko.startActivity

class SelectLanguageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_english_select_language.setOnClickListener {
            startActivity<FirstStartActivity>()
        }
    }
}
