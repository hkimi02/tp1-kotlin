package com.example.radiosample

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.radiosample.ui.theme.RadioSampleTheme

class MainActivity : ComponentActivity() {
    lateinit var layout : LinearLayout
    lateinit var b1 : Button
    lateinit var green : RadioButton
    lateinit var red : RadioButton
    lateinit var yellow : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.main_activty)
        layout = findViewById(R.id.linearLayout1)
        green= findViewById(R.id.radioButton)
        red= findViewById(R.id.radioButton2)
        yellow= findViewById(R.id.radioButton3)
        b1=findViewById(R.id.button)
        b1.setOnClickListener{
            if(green.isChecked)
                layout.setBackgroundColor(Color.GREEN)
            else if(red.isChecked)
                layout.setBackgroundColor(Color.RED)
            else if(yellow.isChecked)
                layout.setBackgroundColor(Color.YELLOW)
        }
    }
}
