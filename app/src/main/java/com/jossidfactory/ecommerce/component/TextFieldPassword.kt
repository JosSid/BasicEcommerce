package com.jossidfactory.ecommerce.component


import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.jossidfactory.ecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldPassword(text: String, textValue: MutableState<String>) {
    val passwordVisible = remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = textValue.value, onValueChange = {
            textValue.value =
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
            Text(text = text, color = MaterialTheme.colorScheme.onBackground)
        }, singleLine = true,
        visualTransformation = if (passwordVisible.value) VisualTransformation.None
        else PasswordVisualTransformation()
    )
}