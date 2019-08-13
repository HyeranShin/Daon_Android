package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_email_phone_input.*
import org.jetbrains.anko.startActivity

class EmailPhoneInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_phone_input)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        tv_next_email_phone_input.setOnClickListener {
            SharedPreferenceController.setEmail(this, et_email_email_phone_input.text.toString())
            SharedPreferenceController.setPhone(this, et_phone_email_phone_input.text.toString())
            startActivity<PickUpLocActivity>()
        }
    }
}
