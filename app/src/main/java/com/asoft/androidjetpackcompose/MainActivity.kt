package com.asoft.androidjetpackcompose

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asoft.androidjetpackcompose.ui.theme.AndroidJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        setContent() {

            AndroidJetpackComposeTheme {

                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(
                            rememberScrollState(),
                            true,
                            null,
                            true
                        ),
                    color = MaterialTheme.colorScheme.background
                ) {

                    LoginPage()

                }

            }

        }

    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun LoginPage() {

        val usernameState = remember {
            mutableStateOf(TextFieldValue())
        }
        val passwordState = remember {
            mutableStateOf(TextFieldValue())
        }

        Image(
        painter = painterResource(id = R.drawable.images),
        contentDescription = "splash_image",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxWidth(01f)
        )


        Column(

            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {


            Text(text = "Login", textAlign = TextAlign.Start, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = usernameState.value,
                onValueChange = { usernameState.value = it },
                label = { Text("Username") },

                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next)
            )

            /*  Spacer(modifier = Modifier.height(8.dp)) */

            OutlinedTextField(
                value = passwordState.value,
                onValueChange = { passwordState.value = it },
                label = { Text("Password") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(

                onClick = {
                },
              /*  modifier = Modifier.fillMaxWidth().height(50.dp),*/
             colors =ButtonDefaults.buttonColors(
                 containerColor = Color.Green,
                 contentColor = Color.Red

             ),
                enabled = true,
                contentPadding = PaddingValues(20.dp,0.dp,20.dp,0.dp)

            ) {
                Text(
                    "Login",
                    style = TextStyle(
                        color = Color.Black
                    )
                )
                Image(
                    painter = painterResource(id = R.drawable.images) ,
                    contentDescription ="",
                    contentScale = ContentScale.Fit)
            }

            /*     Box(
                     modifier = Modifier
                         .fillMaxWidth()
                         .padding(15.dp)
                 ) {

                     ClickableText(

                         text = AnnotatedString("Sign Up here"),
                         onClick = {},
                         style = TextStyle(
                             fontSize = 14.sp,
                             fontFamily = FontFamily.Default,
                         )

                     )

                 }*/

        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun LoginPagePreview() {
        LoginPage()
    }

}


