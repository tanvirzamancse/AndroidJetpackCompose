package com.asoft.androidjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asoft.androidjetpackcompose.ui.theme.AndroidJetpackComposeTheme

class TextViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AndroidJetpackComposeTheme {
                Greeting()
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        var username: String by remember { mutableStateOf("") }

        TextField(
            value = username,

            onValueChange = {
                username= it
            },
            shape = RoundedCornerShape(50),
            singleLine = true,
            placeholder = {
                Text(text = "Enter your username")
            },
            label = {
                Text(text = "Username")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.AccountBox, contentDescription ="")
            },
            prefix = { Text ("+91") },
            trailingIcon = {
                Icon(imageVector = Icons.Filled.Send, contentDescription ="")
            },
            maxLines = 1,
            modifier = Modifier.background(
                Color(0xFFE2EBE2),
                shape = RoundedCornerShape(50)
            ).fillMaxWidth(),

        )

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    AndroidJetpackComposeTheme {
        Greeting()
    }
}