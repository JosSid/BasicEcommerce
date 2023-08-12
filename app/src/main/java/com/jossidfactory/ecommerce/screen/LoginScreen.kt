package com.jossidfactory.ecommerce.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jossidfactory.ecommerce.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val emailValue = remember {
        mutableStateOf("")
    }

    val passwordValue = remember {
        mutableStateOf("")
    }

    val passwordVisible = remember {
        mutableStateOf(false)
    }

    Scaffold(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Image(
                    painter = painterResource(
                        id = R.drawable.applogo
                    ),
                    contentDescription = "Logo",
                    modifier = Modifier.size(100.dp)
                )
                Text(
                    text = "Deliver",
                    fontSize = 30.sp,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 5.sp,
                        color = MaterialTheme.colorScheme.primary
                    )
                )
                Spacer(modifier = Modifier.padding(20.dp))
                OutlinedTextField(
                    value = emailValue.value, onValueChange = {
                        emailValue.value =
                            it
                    },
                    label = {
                        Text(text = "Email", color = MaterialTheme.colorScheme.onBackground)
                    }, singleLine = true
                )
                Spacer(modifier = Modifier.padding(20.dp))
                OutlinedTextField(
                    value = passwordValue.value, onValueChange = {
                        passwordValue.value =
                            it
                    },
                    trailingIcon = {
                        IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                            Icon(
                                painter = painterResource(id = R.drawable.baseline_remove_red_eye_24),
                                tint = if (passwordVisible.value) MaterialTheme
                                    .colorScheme.primary else Color.Gray,
                                contentDescription = "eye"
                            )
                        }
                    },
                    label = {
                        Text(text = "Password", color = MaterialTheme.colorScheme.onBackground)
                    }, singleLine = true,
                    visualTransformation = if (passwordVisible.value) VisualTransformation.None
                    else PasswordVisualTransformation()
                )
                Spacer(modifier = Modifier.padding(20.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Login",
                        fontSize = 20.sp,
                    )
                }
                Spacer(modifier = Modifier.padding(20.dp))
                Text(text = "Sign Up",
                    modifier = Modifier.clickable(
                        onClick = {}
                    ))
            }
        }
    }
}