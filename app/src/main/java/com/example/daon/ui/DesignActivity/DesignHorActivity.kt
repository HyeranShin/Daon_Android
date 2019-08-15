package com.example.daon.ui.DesignActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_design_hor.*

class DesignHorActivity : AppCompatActivity() {

    var designFlag: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_hor)

        designFlag = intent.getIntExtra("flag", 0)
        tv_phone_design_hor.text = SharedPreferenceController.getPhone(applicationContext)
        tv_email_design_hor.text = SharedPreferenceController.getEmail(applicationContext)

        setCardDesign()
    }

    private fun setCardDesign() {
        when(designFlag) {
            1 -> {
                tv_title_design_hor.text = resources.getString(R.string.tv_gung_select_design)
                tv_title_design_hor.background = resources.getDrawable(R.drawable.round_5_gung_dark)
                iv_design_design_hor.setBackgroundResource(R.drawable.illust_1)
                iv_card_design_hor.setBackgroundResource(R.drawable.round_5_gung_light)
                iv_ko_design_hor.setBackgroundResource(R.drawable.icon_ko_blue)
                line_design_hor.setBackgroundColor(resources.getColor(R.color.gung_dark))
                tv_name_ko_design_hor.setTextColor(resources.getColor(R.color.gung_font))
                tv_name_en_design_hor.setTextColor(resources.getColor(R.color.gung_font))
                tv_phone_design_hor.setTextColor(resources.getColor(R.color.gung_font))
                tv_email_design_hor.setTextColor(resources.getColor(R.color.gung_font))
                background_design_hor.setBackgroundColor(resources.getColor(R.color.gung_dark))
                tv_gung_is_select_design.text = resources.getString(R.string.tv_gung_is_select_design)
                tv_gung_desc_select_design.text = resources.getString(R.string.tv_gung_desc_select_design)
            }
            3 -> {
                tv_title_design_hor.text = resources.getString(R.string.tv_sharon_p_select_design)
                tv_title_design_hor.background = resources.getDrawable(R.drawable.round_5_salon_p_dark)
                iv_design_design_hor.setBackgroundResource(R.drawable.illust_3)
                iv_card_design_hor.setBackgroundResource(R.drawable.round_5_salon_p_light)
                iv_ko_design_hor.setBackgroundResource(R.drawable.icon_ko_pink)
                line_design_hor.setBackgroundColor(resources.getColor(R.color.salon_p_dark))
                tv_name_ko_design_hor.setTextColor(resources.getColor(R.color.salon_p_font))
                tv_name_en_design_hor.setTextColor(resources.getColor(R.color.salon_p_font))
                tv_phone_design_hor.setTextColor(resources.getColor(R.color.salon_p_font))
                tv_email_design_hor.setTextColor(resources.getColor(R.color.salon_p_font))
                background_design_hor.setBackgroundColor(resources.getColor(R.color.salon_p_dark))
                tv_gung_is_select_design.text = resources.getString(R.string.tv_sharon_is_select_design)
                tv_gung_desc_select_design.text = resources.getString(R.string.tv_sharon_desc_select_design)
            }
            4 -> {
                tv_title_design_hor.text = resources.getString(R.string.tv_sharon_g_select_design)
                tv_title_design_hor.setBackgroundColor(resources.getColor(R.color.salon_g_dark))
                iv_design_design_hor.setBackgroundResource(R.drawable.illust_4)
                iv_card_design_hor.setBackgroundResource(R.drawable.round_5_salon_g_light)
                iv_ko_design_hor.setBackgroundResource(R.drawable.icon_ko_green)
                line_design_hor.setBackgroundColor(resources.getColor(R.color.salon_g_dark))
                tv_name_ko_design_hor.setTextColor(resources.getColor(R.color.salon_g_font))
                tv_name_en_design_hor.setTextColor(resources.getColor(R.color.salon_g_font))
                tv_phone_design_hor.setTextColor(resources.getColor(R.color.salon_g_font))
                tv_email_design_hor.setTextColor(resources.getColor(R.color.salon_g_font))
                background_design_hor.setBackgroundColor(resources.getColor(R.color.salon_g_dark))
                tv_gung_is_select_design.text = resources.getString(R.string.tv_sharon_is_select_design)
                tv_gung_desc_select_design.text = resources.getString(R.string.tv_sharon_desc_select_design)
            }
        }
    }
}
