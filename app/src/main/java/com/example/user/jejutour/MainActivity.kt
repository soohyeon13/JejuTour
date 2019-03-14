package com.example.user.jejutour

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        jejubtn.setOnClickListener { view ->
            val nextIntent = Intent(this, JejuActivity::class.java)
            startActivity(nextIntent)
        }
        jejuEastbtn.setOnClickListener { view ->
            val nextIntent = Intent(this, JejuEastActivity::class.java)
            startActivity(nextIntent)
        }

        jejuWestbtn.setOnClickListener { view->
            val nextIntent = Intent(this,JejuWestActivity::class.java)
            startActivity(nextIntent)
        }
    }
}
