package com.example.daon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info_enter.*
import org.jetbrains.anko.startActivity

class InfoEnterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_enter)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_next_info_enter.setOnClickListener {
            startActivity<NameRcmdActivity>()
        }
    }
}
