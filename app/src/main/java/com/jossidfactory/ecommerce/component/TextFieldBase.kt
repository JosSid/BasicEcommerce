package com.jossidfactory.ecommerce.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jossidfactory.ecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldBase(text: String, textValue: MutableState<String>) {
    OutlinedTextField(
        value = textValue.value, onValueChange = {
            textValue.value =
                it
        },
        label = {
            Text(text = text, color = MaterialTheme.colorScheme.onBackground)
        }, singleLine = true
    )
}