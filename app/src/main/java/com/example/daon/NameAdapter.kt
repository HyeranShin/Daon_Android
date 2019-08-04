package com.example.daon

import android.content.Context
import android.speech.tts.TextToSpeech
import android.speech.tts.TextToSpeech.ERROR
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.daon.model.NameVO
import com.google.android.material.snackbar.Snackbar
import java.util.*
import kotlin.collections.ArrayList

class NameAdapter(private val ctx: Context, val nameItems: ArrayList<NameVO>): RecyclerView.Adapter<NameAdapter.Holder>(), TextToSpeech.OnInitListener {
    private val tts = TextToSpeech(ctx, this)

    override fun onInit(status: Int) {
        if (status != ERROR) {
            tts.language = Locale.KOREAN
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.item_name, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = nameItems.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.name.text = nameItems[position].name
        holder.pronunciation.text = nameItems[position].pronunciation

        //TODO 클릭 시 UI 변경
        //TODO 데이터 전달
        holder.soundIcon.setOnClickListener {
            tts.speak(nameItems[position].name, TextToSpeech.QUEUE_FLUSH, null)
        }
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tv_ko_name_item_name) as TextView
        val pronunciation: TextView = itemView.findViewById(R.id.tv_en_name_item_name) as TextView
        val meaning: TextView = itemView.findViewById(R.id.tv_meaning_item_name) as TextView
        val soundIcon: ImageButton = itemView.findViewById(R.id.ib_sound_item_name) as ImageButton
    }
}