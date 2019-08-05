package com.example.daon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_after_order.*

class AfterOrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_order)

        tv_big_guide_after_order.text = "${SharedPreferenceController.getName(applicationContext)}님의 \n명함을 \n제작하고 있어요."
        //TODO 언어에 따라
//        tv_big_guide_after_order.text = "We are making \n${SharedPreferenceController.getName(applicationContext)}\'s \nname card."
    }
}
