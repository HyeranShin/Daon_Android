package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_after_order.*
import org.jetbrains.anko.startActivity

class AfterOrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_order)

        setOnClickListener()

//        tv_big_guide_after_order.text = "${SharedPreferenceController.getName(applicationContext)}님의 \n명함을 \n제작하고 있어요."
        tv_big_guide_after_order.text = "We are making \n${SharedPreferenceController.getName(applicationContext)}\'s \nname card."
    }

    private fun setOnClickListener() {
        btn_map_after_order.setOnClickListener {
            startActivity<LocationInfoActivity>()
        }
    }
}
