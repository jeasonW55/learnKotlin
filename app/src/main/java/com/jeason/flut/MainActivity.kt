package com.jeason.flut

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

    private val origin : Float = 65.0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_origin_1.text = origin.toString()

        hello.text = "China no.1"
        hello.setOnClickListener{
            hello()
            val intent: Intent = Intent(this, Class.forName("com.jeason.flut.Main2Activity"))
            startActivity(intent)
        }

        hello.setOnLongClickListener {
            hello.text = "您长摁了一小会"
            lonToast("China always no.1")
            return@setOnLongClickListener  true
        }

        transfer.setOnClickListener {
            tv_origin_3.text = origin.toInt().toString()
        }
    }

}

fun Context.hello() {
    Toast.makeText(this, "hello world!", Toast.LENGTH_SHORT).show()
}

fun Context.lonToast(str : String) {
    Toast.makeText(this, str, Toast.LENGTH_LONG).show()
}