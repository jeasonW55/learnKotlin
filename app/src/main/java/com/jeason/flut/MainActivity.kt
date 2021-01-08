package com.jeason.flut

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val origin : Float = 65.0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        initListener()

    }

    private fun initListener() {
        val int:Int = origin.toInt()
        val boolean:Boolean = origin.isNaN()
        val long: Long = origin.toLong()
        val char: Char = origin.toChar()
        val string: String = origin.toString()
        val double: Double = origin.toDouble()


        transfer_int.setOnClickListener {
            tv_origin_3.text = int.toString()
        }

        transfer_long.setOnClickListener {
            tv_origin_3.text = long.toString()
        }

        transfer_boolean.setOnClickListener {
            tv_origin_3.text = boolean.toString()
        }

        transfer_double.setOnClickListener {
            tv_origin_3.text = double.toString()
        }

        transfer_string.setOnClickListener {
            tv_origin_3.text = string
        }

        tv_origin_3.text = char.toString()
    }



    private fun initView() {
        tv_origin_1.text = origin.toString()
    }

}

fun Context.hello() {
    Toast.makeText(this, "hello world!", Toast.LENGTH_SHORT).show()
}

fun Context.lonToast(str : String) {
    Toast.makeText(this, str, Toast.LENGTH_LONG).show()
}