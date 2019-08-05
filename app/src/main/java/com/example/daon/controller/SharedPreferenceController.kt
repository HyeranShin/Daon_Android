package com.example.daon.controller

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController {
    private val NAME : String = "name"

    /**
     * NAME
     * String
     */
    fun setName(ctx: Context, input_name: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(NAME, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(NAME, input_name)
        editor.commit()
    }

    fun getName(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(NAME, Context.MODE_PRIVATE)
        return preferences.getString(NAME, "")!!
    }
}