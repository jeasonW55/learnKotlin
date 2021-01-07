package com.jeason.flut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Main2Activity : AppCompatActivity(), View.OnClickListener {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button = findViewById(R.id.bt_test)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.bt_test -> Toast.makeText(this, "flut", Toast.LENGTH_SHORT).show()
            }
        }
    }
}