package com.example.practica01


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(mensaje: String, poop: ()->Unit) {
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
        )  {
            Text(
                text="Texto recibido: ",
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = mensaje,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(8.dp))


            Button(
                colors = ButtonColors(
                    containerColor = Color(0xFF264686),
                    contentColor = Color(0xFFFFFFFF),
                    disabledContentColor = Color(0xFF264686),
                    disabledContainerColor = Color(0xFFFFFFFF)
                ),
                onClick = {
                    poop()
                }
            ) {
                Text("Ir a FirstScreen")
            }
        }
    }
}