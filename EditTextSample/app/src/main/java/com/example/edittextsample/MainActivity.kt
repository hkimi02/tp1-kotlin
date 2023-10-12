package com.example.edittextsample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
import androidx.core.view.isInvisible
import android.graphics.Color
import com.example.edittextsample.ui.theme.EditTextSampleTheme

class MainActivity : ComponentActivity() {
    lateinit var Mytext : TextView
    lateinit var mybutton : Button
    lateinit var MyeditText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activty)
        Mytext=findViewById(R.id.text1)
        mybutton=findViewById(R.id.button)
        MyeditText=findViewById(R.id.editTextText)
        Mytext.isInvisible=false
        mybutton.setOnClickListener{
            if(MyeditText.text.toString()==""){
                        Mytext.setTextColor(Color.WHITE)
                        Mytext.setBackgroundColor(Color.BLACK)
                        Mytext.setText("hello dsi32")
                        Mytext.isInvisible=true

            }else{
                Mytext.setText(MyeditText.text.toString())
                Mytext.isInvisible=true
            }
        }
    }
}
