package gg.furia.knowyourfan.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import gg.furia.knowyourfan.R
import gg.furia.knowyourfan.ui.theme.BebasNeue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneroField() {
    val generos = listOf(
        stringResource(id = R.string.gender_male),
        stringResource(id = R.string.gender_female),
        stringResource(id = R.string.gender_other)
    )
    var expanded by remember {
        mutableStateOf(false)
    }
    var selectedGenero by remember {
        mutableStateOf("")
    }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded },
        modifier = Modifier.fillMaxWidth()
    ) {
        OutlinedTextField(
            readOnly = true,
            value = selectedGenero,
            onValueChange = {},
            label = {
                Text(
                    text = stringResource(id = R.string.gender_text),
                    fontFamily = BebasNeue,
                    modifier = Modifier.fillMaxWidth()
                )
            },
            trailingIcon = {
                Icon(
                    Icons.Filled.ArrowDropDown,
                    contentDescription = "Mostrar menu"
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black
            ),
            textStyle = TextStyle(fontFamily = BebasNeue),
            modifier = Modifier.menuAnchor().fillMaxWidth()
        )

        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            generos.forEach { genero ->
                DropdownMenuItem(
                    text = { Text(text = genero, fontFamily = BebasNeue) },
                    onClick = {
                        selectedGenero = genero
                        expanded = false
                    }
                )
            }
        }
    }
}