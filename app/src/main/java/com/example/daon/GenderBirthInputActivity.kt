package com.example.daon

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_gender_birth_input.*
import org.jetbrains.anko.startActivity

class GenderBirthInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gender_birth_input)

        setOnClickListener()

        btn_next_info_enter.isClickable = false
        btn_next_info_enter.setBackgroundColor(resources.getColor(R.color.darkGray))
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

        et_month_info_enter.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(p0!!.isNotEmpty() && et_day_info_enter.text.isNotEmpty()) {
                    btn_next_info_enter.isClickable = true
                    btn_next_info_enter.setBackgroundColor(resources.getColor(R.color.mainColor))
                }
                else {
                    btn_next_info_enter.isClickable = false
                    btn_next_info_enter.setBackgroundColor(resources.getColor(R.color.darkGray))
                }
            }

        })
        et_day_info_enter.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(p0!!.isNotEmpty() && et_month_info_enter.text.isNotEmpty()) {
                    btn_next_info_enter.isClickable = true
                    btn_next_info_enter.setBackgroundColor(resources.getColor(R.color.mainColor))
                }
                else {
                    btn_next_info_enter.isClickable = false
                    btn_next_info_enter.setBackgroundColor(resources.getColor(R.color.darkGray))
                }
            }

        })
    }

    private fun changeViewColor(selected: TextView, notSelected: TextView) {
        selected.setBackgroundResource(R.drawable.round_20_main_color)
        selected.setTextColor(Color.WHITE)
        notSelected.background = null
        notSelected.setTextColor(resources.getColor(R.color.darkGray))
    }
}
