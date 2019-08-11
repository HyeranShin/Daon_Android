package com.example.daon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.daon.controller.SharedPreferenceController
import kotlinx.android.synthetic.main.activity_name_input.*
import org.jetbrains.anko.startActivity

class NameInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_input)

        setOnClickListener()

        tv_next_name_input.isClickable = false
        tv_next_name_input.setBackgroundColor(resources.getColor(R.color.darkGray))
    }

    private fun setOnClickListener() {
        tv_next_name_input.setOnClickListener {
            SharedPreferenceController.setName(this, et_name_name_input.text.toString())
            startActivity<EmailPhoneInputActivity>()
        }
        et_name_name_input.addTextChangedListener(object: TextWatcher {
            var previousString: String = ""

            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                previousString= p0.toString();
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (et_name_name_input.lineCount > 1) {
                    et_name_name_input.setText(previousString)
                    et_name_name_input.setSelection(et_name_name_input.length())
                }

                if(p0!!.isNotEmpty()) {
                    tv_next_name_input.isClickable = true
                    tv_next_name_input.setBackgroundColor(resources.getColor(R.color.mainColor))
                }
                else {
                    tv_next_name_input.isClickable = false
                    tv_next_name_input.setBackgroundColor(resources.getColor(R.color.darkGray))
                }
            }
        })
    }
}
