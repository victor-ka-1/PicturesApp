package com.kasko.victor.testapp.pictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_pickImg.setOnClickListener {
            startActivityForResult( Intent(this, PickImageActivity::class.java),0)
        }
    }


}