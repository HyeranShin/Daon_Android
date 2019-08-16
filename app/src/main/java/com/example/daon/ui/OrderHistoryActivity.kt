package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_order_history.*

class OrderHistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_history)

        tv_name_order_history.text = SharedPreferenceController.getRecipientName(this)
        tv_phon_order_history.text = SharedPreferenceController.getRecipientPhone(this)
        tv_date_order_history.text = SharedPreferenceController.getPickUpDate(this)

        when(SharedPreferenceController.getLocation(applicationContext)) {
            1 -> {
                iv_area_location_info.setBackgroundResource(R.drawable.area_1_1)
                tv_area1_location_info.setText(R.string.tv_area1_1_pick_up_loc)
                tv_area2_location_info.setText(R.string.tv_area1_2_pick_up_loc)
                tv_area3_pick_up_loc.setText(R.string.tv_area1_3_pick_up_loc)
                tv_area4_pick_up_loc.setText(R.string.tv_area1_4_pick_up_loc)
            }
            2 -> {
                iv_area_location_info.setBackgroundResource(R.drawable.area_1_2)
                tv_area1_location_info.setText(R.string.tv_area2_1_pick_up_loc)
                tv_area2_location_info.setText(R.string.tv_area2_2_pick_up_loc)
                tv_area3_pick_up_loc.setText(R.string.tv_area2_3_pick_up_loc)
                tv_area4_pick_up_loc.setText(R.string.tv_area2_4_pick_up_loc)
            }
            3 -> {
                iv_area_location_info.setBackgroundResource(R.drawable.area_2_1)
                tv_area1_location_info.setText(R.string.tv_area3_1_pick_up_loc)
                tv_area2_location_info.setText(R.string.tv_area3_2_pick_up_loc)
                tv_area3_pick_up_loc.setText(R.string.tv_area3_3_pick_up_loc)
                tv_area4_pick_up_loc.setText(R.string.tv_area3_4_pick_up_loc)
            }
            4 -> {
                iv_area_location_info.setBackgroundResource(R.drawable.area_2_2)
                tv_area1_location_info.setText(R.string.tv_area4_1_pick_up_loc)
                tv_area2_location_info.setText(R.string.tv_area4_2_pick_up_loc)
                tv_area3_pick_up_loc.setText(R.string.tv_area4_3_pick_up_loc)
                tv_area4_pick_up_loc.setText(R.string.tv_area4_4_pick_up_loc)
            }
        }
    }
}
