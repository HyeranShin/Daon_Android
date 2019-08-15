package com.example.daon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daon.R
import kotlinx.android.synthetic.main.activity_payment.*
import org.jetbrains.anko.startActivity

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        tv_order_payment.setOnClickListener {
            startActivity<AfterOrderActivity>()
        }
    }
}
