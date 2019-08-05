package com.example.daon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_recipient_info.*
import org.jetbrains.anko.startActivity

class RecipientInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipient_info)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        tv_complete_recipient_info.setOnClickListener {
            startActivity<AfterOrderActivity>()
        }
        et_name_recipient_info.addTextChangedListener(object: TextWatcher {
            var previousString: String = ""

            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                previousString= p0.toString();
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (et_name_recipient_info.lineCount > 1) {
                    et_name_recipient_info.setText(previousString)
                    et_name_recipient_info.setSelection(et_name_recipient_info.length())
                }
            }
        })
    }
}
