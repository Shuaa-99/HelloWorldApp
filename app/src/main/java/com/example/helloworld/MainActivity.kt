package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    println("Hi Shuaa!")
        var num = 4
        if(num == 4){
            println("number $num is Multiples of 2")
        }else {
            print("there is no number ")
        }
    }
}