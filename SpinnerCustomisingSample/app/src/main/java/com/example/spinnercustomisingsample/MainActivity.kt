package com.example.spinnercustomisingsample

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
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
import com.example.spinnercustomisingsample.ui.theme.SpinnerCustomisingSampleTheme

class MainActivity : ComponentActivity() {
    lateinit var textselected:TextView
    lateinit var spinner : Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        textselected=findViewById(R.id.textView)
        spinner=findViewById(R.id.spinner2)
        val gouvernantes = arrayOf("tunis", "bizerte", "nabeul", "sfax", "gabes", "beja", "jendouba")
        var arrayAdapter=ArrayAdapter.createFromResource(this,R.array.gouvernantes,android.R.layout.simple_dropdown_item_1line,gouvernantes)
        spinner.adapter=arrayAdapter
        spinner.onItemSelectedListener =this.textselected.Text=gouvernantes[spinner.selectedItemPosition]

        }
}
