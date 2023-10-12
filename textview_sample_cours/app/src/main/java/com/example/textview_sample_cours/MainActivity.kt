package com.example.textview_sample_cours

import android.graphics.Color
import android.os.Bundle
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
import com.example.textview_sample_cours.ui.theme.Textview_sample_coursTheme

class MainActivity : ComponentActivity() {
    lateinit var myText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        myText=findViewById(R.id.textView3)

        myText.setOnClickListener{
            myText.setTextColor(Color.WHITE)
            myText.setBackgroundColor(Color.BLACK)
        }
    }
}
