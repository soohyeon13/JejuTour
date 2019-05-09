package com.example.user.jejutour

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import com.example.user.jejutour.R.id.autoCompleteTextView
import com.example.user.jejutour.R.id.mRecycleListView
import kotlinx.android.synthetic.main.activity_jeju.*

class JejuActivity :AppCompatActivity() {

    var list_data = arrayListOf("C","C++","Java",".NET","iPhone","Android",
        "PHP")

    var tourList = arrayListOf<Tour>(
        Tour("산굼부리","sangumburi","제주"),
        Tour("산굼부리1","sangumburi","제주"),
        Tour("산굼부리2","sangumburi","제주"),
        Tour("산굼부리3","sangumburi","제주"),
        Tour("산굼부리4","sangumburi","제주")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeju)

        var mAdapter = TourRvAdapter(this,tourList)
        mRecycleListView.adapter =  mAdapter

        var lm = LinearLayoutManager(this)
        mRecycleListView.layoutManager = lm
        mRecycleListView.setHasFixedSize(true)


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