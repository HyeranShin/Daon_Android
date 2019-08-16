package com.example.daon.ui.MyCardActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_my_card_hor.*

class MyCardHorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_card_hor)

        tv_email_card_hor.text = SharedPreferenceController.getEmail(this)
        tv_phone_card_hor.text = SharedPreferenceController.getPhone(this)
    }
}
