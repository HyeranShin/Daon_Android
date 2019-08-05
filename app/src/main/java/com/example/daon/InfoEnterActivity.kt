package com.example.daon

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
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
        tv_male_info_enter.setOnClickListener {
            changeViewColor(tv_male_info_enter, tv_female_info_enter)
        }
        tv_female_info_enter.setOnClickListener {
            changeViewColor(tv_female_info_enter, tv_male_info_enter)
        }
    }

    private fun changeViewColor(selected: TextView, notSelected: TextView) {
        selected.setBackgroundResource(R.drawable.round_20_main_color)
        selected.setTextColor(Color.WHITE)
        notSelected.background = null
        notSelected.setTextColor(resources.getColor(R.color.mainColor))
    }
}
