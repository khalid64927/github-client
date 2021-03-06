package com.jraska.github.client.ui

import android.widget.TextView
import com.airbnb.epoxy.EpoxyModel
import com.jraska.github.client.R

internal class SimpleTextModel(private val text: String) : EpoxyModel<TextView>() {

  override fun getDefaultLayout(): Int {
    return R.layout.item_simple_text
  }

  override fun bind(textView: TextView) {
    textView.text = text
  }
}
