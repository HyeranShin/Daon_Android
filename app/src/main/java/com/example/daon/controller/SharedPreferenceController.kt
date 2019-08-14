package com.example.daon.controller

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController {
    private val NAME : String = "name"
    private val EMAIL : String = "email"
    private val PHONE : String = "phone"
    private val DESIGN : String = "design"
    private val LOCATION : String = "pick up location"
    private val RECIPIENT_NAME : String = "recipient name"
    private val RECIPIENT_PHONE : String = "recipient phone"

    /**
     * Name
     * String
     */
    fun setName(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(NAME, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(NAME, input)
        editor.commit()
    }

    fun getName(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(NAME, Context.MODE_PRIVATE)
        return preferences.getString(NAME, "")!!
    }

    /**
     * Email
     * String
     */
    fun setEmail(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(EMAIL, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(EMAIL, input)
        editor.commit()
    }

    fun getEmail(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(EMAIL, Context.MODE_PRIVATE)
        return preferences.getString(EMAIL, "")!!
    }

    /**
     * Phone
     * String
     */
    fun setPhone(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(PHONE, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(PHONE, input)
        editor.commit()
    }

    fun getPhone(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(PHONE, Context.MODE_PRIVATE)
        return preferences.getString(PHONE, "")!!
    }

    /**
     * Design
     * Int
     * 1~4
     */
    fun setDesign(ctx: Context, input: Int) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(DESIGN, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putInt(DESIGN, input)
        editor.commit()
    }

    fun getDesign(ctx : Context) : Int {
        val preferences : SharedPreferences = ctx.getSharedPreferences(DESIGN, Context.MODE_PRIVATE)
        return preferences.getInt(DESIGN, 0)
    }


    /**
     * Pick Up Location
     * Int
     * 1~4
     */
    fun setLocation(ctx: Context, input: Int) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(LOCATION, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putInt(LOCATION, input)
        editor.commit()
    }

    fun getLocation(ctx : Context) : Int {
        val preferences : SharedPreferences = ctx.getSharedPreferences(LOCATION, Context.MODE_PRIVATE)
        return preferences.getInt(LOCATION, 0)
    }

    /**
     * Recipient Name
     * String
     */
    fun setRecipientName(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(RECIPIENT_NAME, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(RECIPIENT_NAME, input)
        editor.commit()
    }

    fun getRecipientName(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(RECIPIENT_NAME, Context.MODE_PRIVATE)
        return preferences.getString(RECIPIENT_NAME, "")!!
    }

    /**
     * Recipient Phone
     * String
     */
    fun setRecipientPhone(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(RECIPIENT_PHONE, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(RECIPIENT_PHONE, input)
        editor.commit()
    }

    fun getRecipientPhone(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(RECIPIENT_PHONE, Context.MODE_PRIVATE)
        return preferences.getString(RECIPIENT_PHONE, "")!!
    }
}