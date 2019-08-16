package com.example.daon.ui.PreviewActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import com.example.daon.ui.PickUpLocActivity
import kotlinx.android.synthetic.main.activity_preview_hor.*
import kotlinx.android.synthetic.main.activity_preview_ver.*
import org.jetbrains.anko.startActivity

class PreviewVerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview_ver)

        tv_phone_preview_ver.text = SharedPreferenceController.getPhone(applicationContext)
        tv_email_preview_ver.text = SharedPreferenceController.getEmail(applicationContext)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        tv_yes_preview_ver.setOnClickListener {
            SharedPreferenceController.setDesign(this, 2)
            startActivity<PickUpLocActivity>()
        }
    }
}
