package com.example.user.jejutour

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_jeju.*

class JejuActivity :AppCompatActivity() {

    val list_data = arrayListOf("C","C++","Java",".NET","iPhone","Android",
        "PHP")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeju)


        autoCompleteTextView.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })
        autoCompleteTextView.setAdapter(ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,list_data))
    }
}