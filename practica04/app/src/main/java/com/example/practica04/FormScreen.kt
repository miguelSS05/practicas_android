package com.example.practica04

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import com.example.practica04.components.CustomCheckbox
import com.example.practica04.components.CustomRadioButton
import com.example.practica04.components.CustomSwitch
import com.example.practica04.components.CustomSpinner
import com.example.practica04.components.CustomDatePicker

@Composable

fun FormScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text= "Práctica 4: Componentes Avanzados",
            fontSize = 22.sp,
            style = MaterialTheme.typography.headlineMedium
        )

        HorizontalDivider()

        Text("1. Switch", style= MaterialTheme.typography.titleMedium)
        CustomSwitch()

        HorizontalDivider()

        Text("2. RadioButton", style= MaterialTheme.typography.titleMedium)
        CustomRadioButton()

        HorizontalDivider()

        Text("3. Checkbox", style= MaterialTheme.typography.titleMedium)
        CustomCheckbox()

        HorizontalDivider()

        Text("4. Spinner (DropdownMenu)", style= MaterialTheme.typography.titleMedium)
        CustomSpinner()

        HorizontalDivider()

        Text("5. DatePicker", style= MaterialTheme.typography.titleMedium)
        CustomDatePicker()

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                Toast.makeText(context, "Formulario completo", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Probar Formulario")
        }
    }
}