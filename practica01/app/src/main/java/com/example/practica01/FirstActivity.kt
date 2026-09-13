package com.example.practica01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen(onNavigateToSecondScreen: (String) -> Unit) {
    var textoIngresado by remember { mutableStateOf("") }
    Scaffold(
        containerColor = Color(0xFFBACAE0)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           OutlinedTextField(
               colors = TextFieldColors(
                   cursorColor = Color(0xFF264686),
                   disabledIndicatorColor = Color(0xFFFFFFFF),
                   disabledLabelColor = Color(0xFF264686),
                   disabledLeadingIconColor = Color(0xFFFFFFFF),
                   disabledContainerColor = Color(0xFF264686),
                   disabledPlaceholderColor = Color(0xFFFFFFFF),
                   disabledPrefixColor = Color(0xFF264686),
                   focusedTextColor = Color(0xFF264686),
                   unfocusedTextColor = Color(0xFF264686),
                   disabledTextColor = Color(0xFF264686),
                   errorTextColor = Color(0xFF264686),
                   focusedContainerColor = Color(0xFFFFFFFF), // color contenedor
                   unfocusedContainerColor = Color(0xFFFFFFFF),
                   errorContainerColor = Color(0xFF264686),
                   errorCursorColor = Color(0xFF264686),
                   textSelectionColors = TextSelectionColors(handleColor = Color(0xFFE0E8FF), backgroundColor = Color(0xFF264686)),
                   focusedIndicatorColor = Color(0xFF264686),
                   unfocusedIndicatorColor = Color(0xFF264686),
                   errorIndicatorColor =Color(0xFF264686),
                   focusedLeadingIconColor = Color(0xFF264686),
                   unfocusedLeadingIconColor = Color(0xFF264686),
                   errorLeadingIconColor = Color(0xFF264686),
                   focusedTrailingIconColor = Color(0xFF264686),
                   unfocusedTrailingIconColor = Color(0xFF264686),
                   disabledTrailingIconColor = Color(0xFF264686),
                   errorTrailingIconColor = Color(0xFF264686),
                   focusedLabelColor = Color(0xFF264686),
                   unfocusedLabelColor = Color(0xFF264686),
                   errorLabelColor = Color(0xFF264686),
                   focusedPlaceholderColor = Color(0xFF264686),
                   unfocusedPlaceholderColor = Color(0xFF264686),
                   errorPlaceholderColor = Color(0xFF264686),
                   focusedSupportingTextColor = Color(0xFF264686),
                   unfocusedSupportingTextColor = Color(0xFF264686),
                   disabledSupportingTextColor = Color(0xFF264686),
                   errorSupportingTextColor = Color(0xFF264686),
                   focusedPrefixColor = Color(0xFFFFFFFF),
                   unfocusedPrefixColor = Color(0xFFFFFFFF),
                   errorPrefixColor = Color(0xFF264686),
                   focusedSuffixColor = Color(0xFF264686),
                   unfocusedSuffixColor = Color(0xFF264686),
                   disabledSuffixColor = Color(0xFF264686),
                   errorSuffixColor = Color(0xFF264686),
               ),
               value =textoIngresado,
               onValueChange = { textoIngresado = it },
               label = { Text("Escribe tu texto") },
               modifier = Modifier.fillMaxWidth()
           )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                colors = ButtonColors(
                    containerColor = Color(0xFF264686),
                    contentColor = Color(0xFFFFFFFF),
                    disabledContentColor = Color(0xFF264686),
                    disabledContainerColor = Color(0xFFFFFFFF)
                ),
                onClick = {
                    if (textoIngresado.isNotBlank()) {
                        onNavigateToSecondScreen(textoIngresado)
                    }
                }
            ) {
                Text("Ir a SecondScreen")
            }
        }
    }
}