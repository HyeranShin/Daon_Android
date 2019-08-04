package com.example.daon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_start.*
import org.jetbrains.anko.startActivity

class FirstStartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_start)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_name_rcmd_first_start.setOnClickListener {
            startActivity<InfoEnterActivity>()
        }
    }
}


