package com.example.checkboxsample

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.checkboxsample.ui.theme.CheckBoxSampleTheme

class MainActivity : ComponentActivity() {
    lateinit var txtbox: TextView
    lateinit var ch1: CheckBox
    lateinit var ch2: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        txtbox=findViewById(R.id.textView2)
        ch1=findViewById(R.id.checkBox1)
        ch2=findViewById(R.id.checkBox2)
        ch1.setOnClickListener{
            if(ch1.isChecked){
                txtbox.setText("yes i have !")
                ch2.isChecked=false
            }
        }

        ch2.setOnClickListener{
            if(ch2.isChecked){
                txtbox.setText("no i havent !")
                ch1.isChecked=false
            }
        }

    }
}

