package com.busedemir.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        println("onStart() durumundayım.")
    }
    override fun onResume() {
        super.onResume()
        println("onResume() durumundayım.")
    }
    override fun onPause() {
        super.onPause()
        println("onPause() durumundayım.")
    }
    override fun onStop() {
        super.onStop()
        println("onStop() durumundayım.")
    }


}