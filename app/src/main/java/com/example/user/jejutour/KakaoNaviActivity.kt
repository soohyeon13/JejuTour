package com.example.user.jejutour

import android.location.Location
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_kakaonavi.*

class KakaoNaviActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_kakaonavi)

    }

    inner class KakaoNaviBtnListener : View.OnClickListener {
        override fun onClick(v: View?) {
            if (v?.id == R.id.btn1) {

            }
        }
    }
}