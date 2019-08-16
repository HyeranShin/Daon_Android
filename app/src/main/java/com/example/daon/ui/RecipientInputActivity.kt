package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.daon.R
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_recipient_input.*
import org.jetbrains.anko.startActivity

class RecipientInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipient_input)

        setOnClickListener()

        tv_complete_recipient_info.isClickable = false
        tv_complete_recipient_info.setBackgroundColor(resources.getColor(R.color.darkGray))
    }

    private fun setOnClickListener() {
        tv_complete_recipient_info.setOnClickListener {
            SharedPreferenceController.setRecipientName(this, et_name_recipient_input.text.toString())
            SharedPreferenceController.setRecipientPhone(this, et_phone_recipient_info.text.toString())
            startActivity<AfterOrderActivity>()
        }
        et_name_recipient_input.addTextChangedListener(object: TextWatcher {
            var previousString: String = ""

            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                previousString= p0.toString();
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (et_name_recipient_input.lineCount > 1) {
                    et_name_recipient_input.setText(previousString)
                    et_name_recipient_input.setSelection(et_name_recipient_input.length())
                }
                if(et_phone_recipient_info.text.toString().length == 4 && p0!!.isNotEmpty()) {
                    tv_complete_recipient_info.isClickable = true
                    tv_complete_recipient_info.setBackgroundColor(resources.getColor(R.color.mainColor))
                }
                else {
                    tv_complete_recipient_info.isClickable = false
                    tv_complete_recipient_info.setBackgroundColor(resources.getColor(R.color.darkGray))
                }
            }
        })
        et_phone_recipient_info.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(p0!!.length == 4 && et_name_recipient_input.text.isNotEmpty()) {
                    tv_complete_recipient_info.isClickable = true
                    tv_complete_recipient_info.setBackgroundColor(resources.getColor(R.color.mainColor))
                }
                else {
                    tv_complete_recipient_info.isClickable = false
                    tv_complete_recipient_info.setBackgroundColor(resources.getColor(R.color.darkGray))
                }
            }

        })
    }
}
