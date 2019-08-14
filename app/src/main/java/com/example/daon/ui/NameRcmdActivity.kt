package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import com.example.daon.model.NameVO
import kotlinx.android.synthetic.main.activity_name_rcmd.*
import org.jetbrains.anko.startActivity
import java.util.*
import kotlin.collections.ArrayList

class NameRcmdActivity : AppCompatActivity(), TextToSpeech.OnInitListener  {

    private lateinit var tts: TextToSpeech

    override fun onInit(p0: Int) {
        if (p0 != TextToSpeech.ERROR) {
            tts.language = Locale.KOREAN
        }
    }

    var koName: String = ""
    var enName: String = ""
    var meaning: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_rcmd)

        tts = TextToSpeech(applicationContext, this)

        setNameCardData()
        setOnClickListener()

        btn_selected_name_rcmd.isClickable = false
        btn_selected_name_rcmd.setBackgroundColor(resources.getColor(R.color.darkGray))

        //TODO 데이터 전달, 세팅
    }

    private fun setNameCardData() {
        var nameItems: ArrayList<NameVO> = NameVO.selectNameRandomly()

        tv_ko_name_item_name_1.text = nameItems[0].name
        tv_en_name_item_name_1.text = nameItems[0].pronunciation
        tv_meaning_item_name_1.text = nameItems[0].meaningEn
        tv_ko_name_item_name_2.text = nameItems[1].name
        tv_en_name_item_name_2.text = nameItems[1].pronunciation
        tv_meaning_item_name_2.text = nameItems[1].meaningEn
        tv_ko_name_item_name_3.text = nameItems[2].name
        tv_en_name_item_name_3.text = nameItems[2].pronunciation
        tv_meaning_item_name_3.text = nameItems[2].meaningEn
    }

    private fun setOnClickListener() {
        rcmd_name_1.setOnClickListener {
            initNameSelect()
            koName = tv_ko_name_item_name_1.text.toString()
            enName = tv_en_name_item_name_1.text.toString()
            meaning = tv_meaning_item_name_1.text.toString()
            tv_ko_name_item_name_1.setTextColor(resources.getColor(R.color.mainColor))
            tv_en_name_item_name_1.setTextColor(resources.getColor(R.color.mainColor))
            tv_meaning_item_name_1.setTextColor(resources.getColor(R.color.mainColor))
            btn_selected_name_rcmd.isClickable = true
            btn_selected_name_rcmd.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        rcmd_name_2.setOnClickListener {
            initNameSelect()
            koName = tv_ko_name_item_name_2.text.toString()
            enName = tv_en_name_item_name_2.text.toString()
            meaning = tv_meaning_item_name_2.text.toString()
            tv_ko_name_item_name_2.setTextColor(resources.getColor(R.color.mainColor))
            tv_en_name_item_name_2.setTextColor(resources.getColor(R.color.mainColor))
            tv_meaning_item_name_2.setTextColor(resources.getColor(R.color.mainColor))
            btn_selected_name_rcmd.isClickable = true
            btn_selected_name_rcmd.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        rcmd_name_3.setOnClickListener {
            initNameSelect()
            koName = tv_ko_name_item_name_3.text.toString()
            enName = tv_en_name_item_name_3.text.toString()
            meaning = tv_meaning_item_name_3.text.toString()
            tv_ko_name_item_name_3.setTextColor(resources.getColor(R.color.mainColor))
            tv_en_name_item_name_3.setTextColor(resources.getColor(R.color.mainColor))
            tv_meaning_item_name_3.setTextColor(resources.getColor(R.color.mainColor))
            btn_selected_name_rcmd.isClickable = true
            btn_selected_name_rcmd.setBackgroundColor(resources.getColor(R.color.mainColor))
        }
        ib_sound_item_name_1.setOnClickListener {
            tts.speak(tv_ko_name_item_name_1.text.toString(), TextToSpeech.QUEUE_FLUSH, null)
        }
        ib_sound_item_name_2.setOnClickListener {
            tts.speak(tv_ko_name_item_name_2.text.toString(), TextToSpeech.QUEUE_FLUSH, null)
        }
        ib_sound_item_name_3.setOnClickListener {
            tts.speak(tv_ko_name_item_name_3.text.toString(), TextToSpeech.QUEUE_FLUSH, null)
        }
        ib_sound_item_name.setOnClickListener {
            tts.speak(tv_ko_name_item_name.text.toString(), TextToSpeech.QUEUE_FLUSH, null)
        }
        btn_rcmd_again_name_rcmd.setOnClickListener {
            initNameSelect()
            btn_selected_name_rcmd.isClickable = false
            btn_selected_name_rcmd.setBackgroundColor(resources.getColor(R.color.darkGray))
            setNameCardData()
        }
        btn_selected_name_rcmd.setOnClickListener {
            tv_ko_name_item_name.text = koName
            tv_en_name_item_name.text = enName
            tv_meaning_item_name.text = meaning
            layout_check_selected_name_name_rcmd.visibility = View.VISIBLE
        }
        btn_yes_name_rcmdc.setOnClickListener {
            SharedPreferenceController.setName(this, tv_ko_name_item_name.text.toString())
            startActivity<SelectDesignActivity>()
        }
        btn_no_name_rcmd.setOnClickListener {
            layout_check_selected_name_name_rcmd.visibility = View.INVISIBLE
        }
    }

    private fun initNameSelect() {
        tv_ko_name_item_name_1.setTextColor(resources.getColor(R.color.darkGray))
        tv_en_name_item_name_1.setTextColor(resources.getColor(R.color.darkGray))
        tv_meaning_item_name_1.setTextColor(resources.getColor(R.color.darkGray))
        tv_ko_name_item_name_2.setTextColor(resources.getColor(R.color.darkGray))
        tv_en_name_item_name_2.setTextColor(resources.getColor(R.color.darkGray))
        tv_meaning_item_name_2.setTextColor(resources.getColor(R.color.darkGray))
        tv_ko_name_item_name_3.setTextColor(resources.getColor(R.color.darkGray))
        tv_en_name_item_name_3.setTextColor(resources.getColor(R.color.darkGray))
        tv_meaning_item_name_3.setTextColor(resources.getColor(R.color.darkGray))
    }
}
