package com.example.daon.ui

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_payment.*
import org.jetbrains.anko.startActivity

class PaymentActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        tv_date_payment.text = "2019-08-16"

        setViewData()
        setOnClickListener()
    }

    private fun setViewData() {
        tv_info_payment.text = SharedPreferenceController.getEnName(this)+"\n"+SharedPreferenceController.getPhone(this)+"\n"+SharedPreferenceController.getEmail(this)

        when(SharedPreferenceController.getDesign(this)) {
            1 -> {
                tv_design_payment.text = "경복궁"
                iv_design_payment.background = ContextCompat.getDrawable(applicationContext,
                    R.drawable.illust_1_mini
                )
            }
            2 -> {
                tv_design_payment.text = "N타워"
                iv_design_payment.background = ContextCompat.getDrawable(applicationContext,
                    R.drawable.illust_2_mini
                )
            }
            3 -> {
                tv_design_payment.text = "무궁화 1"
                iv_design_payment.background = ContextCompat.getDrawable(applicationContext,
                    R.drawable.illust_3_mini
                )
            }
            4 -> {
                tv_design_payment.text = "무궁화 2"
                iv_design_payment.background = ContextCompat.getDrawable(applicationContext,
                    R.drawable.illust_4_mini
                )
            }
        }
        when(SharedPreferenceController.getLocation(this)) {
            1 -> {
                tv_loc1_payment.text = "제1 여객터미널 1층 입국장"
                tv_loc2_payment.text = "1층 4번 출구 다온 명함 수령센터"
            }
            2 -> {
                tv_loc1_payment.text = "제1 여객터미널 3층 출국장"
                tv_loc2_payment.text = "3층 F 카운터 부근 다온 명함 수령센터"
            }
            3 -> {
                tv_loc1_payment.text = "제2 여객터미널 1층 입국장"
                tv_loc2_payment.text = "1층 2번 출구 다온 명함 수령센터"
            }
            4 -> {
                tv_loc1_payment.text = "제2 여객터미널 3층 출국장"
                tv_loc2_payment.text = "3층 G 카운터 부근 다온 명함 수령센터"
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setOnClickListener() {
        tv_order_payment.setOnClickListener {
            SharedPreferenceController.setRecipientName(this, et_name_payment.text.toString())
            SharedPreferenceController.setRecipientPhone(this, et_phone_payment.text.toString())
            SharedPreferenceController.setPickUpDate(this, tv_date_payment.text.toString())
            startActivity<AfterOrderActivity>()
        }
        dataPicker.setOnDateChangedListener { datePicker, y, m, d ->
            var month: String = (m+1).toString()
            if(month.length == 1) {
                month = "0$month"
            }
            var day: String = d.toString()
            if(day.length == 1) {
                day = "0$day"
            }
            tv_date_payment.text = y.toString()+'-'+month+'-'+day
        }

    }
}
