package com.example.togglebutton

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.togglebutton.ui.theme.ToggleButtonTheme

class MainActivity : ComponentActivity() {
    lateinit var Text : TextView
    lateinit var img : ImageView
    lateinit var toggleBt : ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        Text=findViewById(R.id.textView)
        img=findViewById(R.id.imageView)
        toggleBt=findViewById(R.id.toggleButton)
        toggleBt.isChecked=true

        toggleBt.setOnClickListener{
            if(toggleBt.isChecked){
                img.visibility= View.VISIBLE
                Text.setText("the image is visible");
            }else{
                img.visibility=View.INVISIBLE
                Text.setText("the image is not visible")
            }
        }
    }
}
