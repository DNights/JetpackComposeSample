package dev.dnights.jetpackcompsesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposable()
        }
    }
}

@Composable
fun SimpleComposable() {
    Column{
        Text("Hello World")
        Text("Hello World2")
        Text("Hello World3")
    }
}

@Preview(showSystemUi = true)
@Composable
fun ComposablePreview() {
    SimpleComposable()
}