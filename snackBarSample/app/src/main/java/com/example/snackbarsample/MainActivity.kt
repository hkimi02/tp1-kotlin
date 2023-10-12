package com.example.snackbarsample

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import com.google.android.material.snackbar.Snackbar
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.snackbarsample.ui.theme.SnackBarSampleTheme

class MainActivity : ComponentActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        button=findViewById(R.id.button)
        button.setOnClickListener{
            Snackbar.make(R.layout.main_activity,R.string.app_name).setAction("close",View.onClickListenner{}).show
        }
    }
}
