package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(sizes1: MainActivity, private val sizes: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return sizes.size
    }

    override fun getItem(position: Int): Any {
        return sizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val textView = convertView as? TextView ?: TextView(parent.context)
        textView.text = sizes[position].toString()
        textView.textSize = 22f
        return textView
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val textView = convertView as? TextView ?: TextView(parent.context)
        textView.text = sizes[position].toString()
        textView.textSize = sizes[position].toFloat()
        return textView
    }
}