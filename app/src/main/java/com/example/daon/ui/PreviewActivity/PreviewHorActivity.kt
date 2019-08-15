package com.example.daon.ui.PreviewActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import com.example.daon.ui.PickUpLocActivity
import kotlinx.android.synthetic.main.activity_preview_hor.*
import org.jetbrains.anko.startActivity

class PreviewHorActivity : AppCompatActivity() {
    var designFlag : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview_hor)

        designFlag = intent.getIntExtra("flag", 0)
        tv_phone_preview_hor.text = SharedPreferenceController.getPhone(applicationContext)
        tv_email_preview_hor.text = SharedPreferenceController.getEmail(applicationContext)

        setCardDesign()
        setOnClickListener()
    }

    private fun setOnClickListener() {
        tv_yes_preview_hor.setOnClickListener {
            SharedPreferenceController.setDesign(this, designFlag)
            startActivity<PickUpLocActivity>()
        }
    }

    private fun setCardDesign() {
        when(designFlag) {
            1 -> {
                iv_design_preview_hor.setBackgroundResource(R.drawable.illust_1)
                iv_card_preview_hor.setBackgroundResource(R.drawable.round_5_gung_light)
                iv_ko_preview_hor.setBackgroundResource(R.drawable.icon_ko_blue)
                line_preview_hor.setBackgroundColor(resources.getColor(R.color.gung_dark))
                tv_name_ko_preview_hor.setTextColor(resources.getColor(R.color.gung_font))
                tv_name_en_preview_hor.setTextColor(resources.getColor(R.color.gung_font))
                tv_phone_preview_hor.setTextColor(resources.getColor(R.color.gung_font))
                tv_email_preview_hor.setTextColor(resources.getColor(R.color.gung_font))
            }
            3 -> {
                iv_design_preview_hor.setBackgroundResource(R.drawable.illust_3)
                iv_card_preview_hor.setBackgroundResource(R.drawable.round_5_salon_p_light)
                iv_ko_preview_hor.setBackgroundResource(R.drawable.icon_ko_pink)
                line_preview_hor.setBackgroundColor(resources.getColor(R.color.salon_p_dark))
                tv_name_ko_preview_hor.setTextColor(resources.getColor(R.color.salon_p_font))
                tv_name_en_preview_hor.setTextColor(resources.getColor(R.color.salon_p_font))
                tv_phone_preview_hor.setTextColor(resources.getColor(R.color.salon_p_font))
                tv_email_preview_hor.setTextColor(resources.getColor(R.color.salon_p_font))
            }
            4 -> {
                iv_design_preview_hor.setBackgroundResource(R.drawable.illust_4)
                iv_card_preview_hor.setBackgroundResource(R.drawable.round_5_salon_g_light)
                iv_ko_preview_hor.setBackgroundResource(R.drawable.icon_ko_green)
                line_preview_hor.setBackgroundColor(resources.getColor(R.color.salon_g_dark))
                tv_name_ko_preview_hor.setTextColor(resources.getColor(R.color.salon_g_font))
                tv_name_en_preview_hor.setTextColor(resources.getColor(R.color.salon_g_font))
                tv_phone_preview_hor.setTextColor(resources.getColor(R.color.salon_g_font))
                tv_email_preview_hor.setTextColor(resources.getColor(R.color.salon_g_font))
            }
        }
    }
}
