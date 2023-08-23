package com.asoft.androidjetpackcompose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.asoft.androidjetpackcompose.ui.theme.AndroidJetpackComposeTheme

class ButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeTheme {
                CustomButton()
            }
        }
    }
}

@Composable
fun CustomButton() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp, 60.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(

            onClick = {
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF4CAF50)
                , contentColor = Color.Black
            ),

            ) {

            Text(text = "Round Button")

        }
        Button(
            onClick = {
            },
            shape = RoundedCornerShape(
                topStart = 30.dp,
                bottomEnd = 30.dp,
                topEnd = 0.dp,
                bottomStart = 0.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta
            )
        ) {

            Text(text = "Rectangle Button")

        }

        Button(
            onClick = {
            },
            shape = RoundedCornerShape(
                topStart = 10.dp,
                bottomEnd = 10.dp,
                topEnd = 10.dp,
                bottomStart = 10.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),

            ) {

            Text(text = "Rectangle Button")

        }
        Button(
            onClick = {
            },
            shape = CutCornerShape(
                topStart = 10.dp,
                bottomEnd = 10.dp,
                topEnd = 10.dp,
                bottomStart = 10.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Green
            ),
            enabled = true,
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 8.dp
            )

        ) {

            Text(text = "Cut Corner Shape")

        }

        Button(
            onClick = {
            },
            modifier = Modifier.size(150.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 15.dp
            )
        ) {

            Text(text = "Circle Button")

        }

        Button(

            onClick = {
            },


            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 5.dp,
                pressedElevation = 15.dp
            ),

            modifier = Modifier.size(60.dp),

            ) {
            Icon(imageVector = Icons.Filled.Add, contentDescription ="")
        }

        Button(
            onClick = {
            },
            modifier = Modifier.size(150.dp,40.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 15.dp
            ),
            border = BorderStroke(2.dp, Color.Green)
        ) {

            Text(text = "Button")
            Icon(imageVector = Icons.Filled.Face, contentDescription ="")

        }

    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ButtonPreview() {
    AndroidJetpackComposeTheme {
        CustomButton()
    }
}