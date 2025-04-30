package gg.furia.knowyourfan.components

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import gg.furia.knowyourfan.R
import gg.furia.knowyourfan.ui.theme.BebasNeue
import java.util.Calendar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataNascimentoField() {
    val context = LocalContext.current
    var dataNascimento by remember { mutableStateOf("") }
    val calendario = Calendar.getInstance()
    val datePicker = remember {
        DatePickerDialog(
            context,
            { _: DatePicker, ano: Int, mes: Int, diaDoMes: Int ->
                dataNascimento = String.format("%02d/%02d/%04d", diaDoMes, mes + 1, ano)
            },
            calendario.get(Calendar.YEAR),
            calendario.get(Calendar.MONTH),
            calendario.get(Calendar.DAY_OF_MONTH)
        )
    }

    OutlinedTextField(
        value = dataNascimento,
        onValueChange = {},
        label = {
            Text(
                text = stringResource(id = R.string.birthday_text),
                fontFamily = BebasNeue
            )
        },
        modifier = Modifier.fillMaxWidth(),
        readOnly = true,
        textStyle = TextStyle(fontFamily = BebasNeue),
        colors = OutlinedTextFieldDefaults.colors(
            disabledLabelColor = Color.Black,
            disabledTextColor = Color.Black,
            disabledBorderColor = Color.Black,
            focusedBorderColor = Color.Black,
        ),
        trailingIcon = {
            Icon(
                painter = painterResource(R.drawable.calendar_month),
                contentDescription = stringResource(id = R.string.select_date),
                modifier = Modifier.clickable {
                    datePicker.show()
                }
            )
        }
    )
}