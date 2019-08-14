package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import com.example.daon.ui.PreviewActivity.PreviewHorActivity
import com.example.daon.ui.PreviewActivity.PreviewVerActivity
import kotlinx.android.synthetic.main.activity_pick_up_loc.*
import kotlinx.android.synthetic.main.activity_select_design.*
import org.jetbrains.anko.startActivity

class SelectDesignActivity : AppCompatActivity() {
    var designFlag = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_design)

        setOnClickListener()

        tv_selected_select_design.isClickable = false
        tv_selected_select_design.setBackgroundColor(resources.getColor(R.color.darkGray))
    }

    private fun setOnClickListener() {
        relative_design1.setOnClickListener {
            initDesignSelect()
            designFlag = 1
            iv_check1_select_design.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_selected_select_design.isClickable = true
            tv_selected_select_design.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        relative_design2.setOnClickListener {
            initDesignSelect()
            designFlag = 2
            iv_check2_select_design.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_selected_select_design.isClickable = true
            tv_selected_select_design.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        relative_design3.setOnClickListener {
            initDesignSelect()
            designFlag = 3
            iv_check3_select_design.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_selected_select_design.isClickable = true
            tv_selected_select_design.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        relative_design4.setOnClickListener {
            initDesignSelect()
            designFlag = 4
            iv_check4_select_design.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_selected_select_design.isClickable = true
            tv_selected_select_design.setBackgroundColor(resources.getColor(R.color.mainColor))
        }

        tv_selected_select_design.setOnClickListener {
            SharedPreferenceController.setDesign(this, designFlag)
            when(designFlag) {
                2 -> startActivity<PreviewVerActivity>()
                else -> startActivity<PreviewHorActivity>()
            }
        }
    }

    private fun initDesignSelect() {
        iv_check1_select_design.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
        iv_check2_select_design.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
        iv_check3_select_design.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
        iv_check4_select_design.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
    }
}
