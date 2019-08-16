package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_pick_up_loc.*
import org.jetbrains.anko.startActivity

class PickUpLocActivity : AppCompatActivity() {
    var areaFlag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_up_loc)

        setOnClickListener()

        tv_complete_pick_up_loc.isClickable = false
        tv_complete_pick_up_loc.setBackgroundColor(resources.getColor(R.color.darkGray))
    }

    private fun setOnClickListener() {
        relative_area1.setOnClickListener {
            initLocSelect()
            areaFlag = 1
            iv_check1_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_complete_pick_up_loc.isClickable = true
            tv_complete_pick_up_loc.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        relative_area2.setOnClickListener {
            initLocSelect()
            areaFlag = 2
            iv_check2_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_complete_pick_up_loc.isClickable = true
            tv_complete_pick_up_loc.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        relative_area3.setOnClickListener {
            initLocSelect()
            areaFlag = 3
            iv_check3_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_complete_pick_up_loc.isClickable = true
            tv_complete_pick_up_loc.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        relative_area4.setOnClickListener {
            initLocSelect()
            areaFlag = 4
            iv_check4_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
                R.drawable.icon_check_o
            )
            tv_complete_pick_up_loc.isClickable = true
            tv_complete_pick_up_loc.setBackgroundColor(resources.getColor(R.color.mainColor))
        }

        tv_complete_pick_up_loc.setOnClickListener {
            SharedPreferenceController.setLocation(this, areaFlag)
            startActivity<PaymentActivity>()
        }
    }

    private fun initLocSelect() {
        iv_check1_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
        iv_check2_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
        iv_check3_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
        iv_check4_pick_up_loc.background = ContextCompat.getDrawable(applicationContext,
            R.drawable.icon_check_x
        )
    }
}
