package com.example.daon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.daon.controller.SharedPreferenceController
import com.example.daon.model.NameVO
import kotlinx.android.synthetic.main.activity_name_rcmd.*
import org.jetbrains.anko.startActivity

class NameRcmdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_rcmd)

        tv_big_guide_name_rcmd.textSize = 34F
        tv_big_guide_name_rcmd.textAlignment = View.TEXT_ALIGNMENT_CENTER

        var nameItems: ArrayList<NameVO> = NameVO.selectNameRandomly()
        var nameAdapter = NameAdapter(this, nameItems)

        rv_name_list_name_rcmd.layoutManager = LinearLayoutManager(this)
        rv_name_list_name_rcmd.adapter = nameAdapter

        setOnClickListener()

        //TODO 데이터 전달, 세팅
    }

    private fun setOnClickListener() {
        btn_selected_name_rcmd.setOnClickListener {
            layout_check_selected_name_name_rcmd.visibility = View.VISIBLE
        }
        btn_yes_name_rcmdc.setOnClickListener {
            SharedPreferenceController.setName(this, tv_ko_name_name_rcmd.text.toString())
            startActivity<PickUpLocActivity>()
        }
        btn_no_name_rcmd.setOnClickListener {
            layout_check_selected_name_name_rcmd.visibility = View.INVISIBLE
        }
    }
}
