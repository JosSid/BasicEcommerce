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
import com.jossidfactory.ecommerce.component.ButtonBase
import com.jossidfactory.ecommerce.component.LogoApp
import com.jossidfactory.ecommerce.component.TextClick
import com.jossidfactory.ecommerce.component.TextFieldBase
import com.jossidfactory.ecommerce.component.TextFieldPassword

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {
    val nameValue = remember {
        mutableStateOf("")
    }
    val emailValue = remember {
        mutableStateOf("")
    }
    val phoneValue = remember {
        mutableStateOf("")
    }
    val passwordValue = remember {
        mutableStateOf("")
    }
    val confirmPasswordValue = remember {
        mutableStateOf("")
    }

    Scaffold(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                LogoApp()
                Spacer(modifier = Modifier.padding(20.dp))
                TextFieldBase(text = "Name", textValue = nameValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase(text = "Email", textValue = emailValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldBase(text = "Phone", textValue = phoneValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassword(text = "Password", textValue = passwordValue)
                Spacer(modifier = Modifier.padding(5.dp))
                TextFieldPassword(text = "Confirm Password", textValue = confirmPasswordValue)
                Spacer(modifier = Modifier.padding(5.dp))
                ButtonBase(text = "SignUp", onClick = {})
                Spacer(modifier = Modifier.padding(5.dp))
                TextClick(text = "Login", onClick = {})
            }
        }
    }
}