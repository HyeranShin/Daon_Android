package com.example.daon.ui.DesignActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_design_ver.*

class DesignVerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_ver)


        tv_phone_design_ver.text = SharedPreferenceController.getPhone(applicationContext)
        tv_email_design_ver.text = SharedPreferenceController.getEmail(applicationContext)
    }
}
