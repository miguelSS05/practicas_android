package com.example.practica04.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

@Composable
fun CustomSpinner() {
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf("Seleccionar Opción") }

    Box(modifier = Modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = selectedText,
            onValueChange = {},
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                IconButton(onClick = { expanded = true}) {
                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)

                }
            }
        )

        DropdownMenu (
            expanded = expanded,
            onDismissRequest = { expanded = false}
        ) {
            DropdownMenuItem(
                text = { Text("Elemento A")},
                onClick = {
                    selectedText = "Elemento A"
                    expanded = false
                }
            )

            DropdownMenuItem(
                text = { Text("Elemento B")},
                onClick = {
                    selectedText = "Elemento B"
                    expanded = false
                }
            )
        }
    }
}