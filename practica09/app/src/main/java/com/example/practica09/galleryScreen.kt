package com.example.practica09

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon

@Composable
fun GaleriaScreen() {
    val imagenes = listOf(
        "https://picsum.photos/id/1018/400/400",
        "https://picsum.photos/id/1015/400/400",
        "https://picsum.photos/id/1019/400/400",
        "https://picsum.photos/id/1020/400/400",
        "https://picsum.photos/id/1021/400/400",
        "https://picsum.photos/id/1022/400/400",
        "https://picsum.photos/id/1023/400/400",
        "https://picsum.photos/id/1024/400/400"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .padding(top = 32.dp)
    ) {
        Text(
            text = "Mi Galería",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(8.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(imagenes) {
                url ->
                    ImagenItem(url = url)
            }
        }
    }
}

@Composable
fun ImagenItem(url: String) {
    var isActive by rememberSaveable { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable{ isActive = !isActive }
            .aspectRatio(1f),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        AsyncImage(
            model = url,
            contentDescription = "Imagen de la galería",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        if (isActive) {
            AlertDialogExample("a","a",Icons.Default.Add, {isActive=false}, url=url)
        }
    }
}

@Composable
fun AlertDialogExample(
    dialogTitle: String,
    dialogText: String,
    icon: ImageVector,
    onConfirmation: () -> Unit,
    url: String
) {
    AlertDialog(
        modifier = Modifier.fillMaxWidth(),

        text = {
            AsyncImage(
                model = url,
                contentDescription = "Imagen de la galería",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )
        },
        onDismissRequest = {
            // onDismissRequest()
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmation()
                }
            ) {
                Text("Ok")
            }
        }
    )
}