package com.example.buttonsample

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var myText:TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}
