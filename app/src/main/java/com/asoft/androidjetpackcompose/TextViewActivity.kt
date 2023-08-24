package com.asoft.androidjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        editTextOne()
        editTextTwo()


    }
}

@Composable
fun editTextTwo() {
    var username: String by remember { mutableStateOf("") }

    OutlinedTextField(
        value = username,
        onValueChange = {
            username = it
        },

        modifier = Modifier
            .background(Color.Transparent, shape = RoundedCornerShape(15)),

        shape = RoundedCornerShape(15),
        singleLine = true,
        maxLines = 1,

        colors = TextFieldDefaults.colors(

            focusedIndicatorColor = Color.Black,
            unfocusedIndicatorColor = Color.Black,
            disabledIndicatorColor = Color.Black,
            focusedContainerColor = Color.Green,
            unfocusedContainerColor = Color.Green,
            disabledContainerColor = Color.Green,

        ),

        placeholder = {
            Text(text = "Enter your username")
        },
        label = {
            Text(text = "Username", color = Color.Black)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.AccountBox, contentDescription = "",tint = Color.Black)
        },
        prefix = { Text("", color = Color.Black) },
        trailingIcon = {
            /* Icon(imageVector = Icons.Default.Send, contentDescription = "", tint = Color.Black)*/
        },
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 15.sp,
           ),

        )
}

@Composable
fun editTextOne() {
    var username: String by remember { mutableStateOf("") }

    TextField(value = username,
        onValueChange = {
            username = it
        },

        modifier = Modifier
            .padding(10.dp)
            .background(Color.Transparent, shape = RoundedCornerShape(15))
            .height(55.dp),
        shape = RoundedCornerShape(15),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.colors(

            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            focusedContainerColor = Color.LightGray,
            unfocusedContainerColor = Color.LightGray
        ),
        placeholder = {
            Text(text = "Enter your username")
        },
        label = {
            Text(text = "Username", color = Color.Black)
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.AccountBox, contentDescription = "",tint = Color.Black)
        },
        prefix = { Text("", color = Color.Black) },
        trailingIcon = {
            /* Icon(imageVector = Icons.Default.Send, contentDescription = "", tint = Color.Black)*/
        },
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 15.sp,
            textDecoration = TextDecoration.None,
            baselineShift = BaselineShift.None ),

        )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview3() {
    AndroidJetpackComposeTheme {
        Greeting()
    }
}