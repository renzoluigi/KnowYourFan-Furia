package gg.furia.knowyourfan.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import gg.furia.knowyourfan.R
import gg.furia.knowyourfan.components.DataNascimentoField
import gg.furia.knowyourfan.components.GeneroField
import gg.furia.knowyourfan.components.TopBarPadrao
import gg.furia.knowyourfan.ui.theme.BebasNeue

@Composable
fun CadastroScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopBarPadrao(titulo = "Cadastro")
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_down_bg),
                contentDescription = "Plano de fundo",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(615.dp)
                    .padding(16.dp),
                colors = CardDefaults.cardColors(Color.White),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.register_title),
                        modifier = Modifier.padding(8.dp),
                        fontSize = 28.sp,
                    )
                    OutlinedTextField(
                        onValueChange = {
                        },
                        value = "",
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = stringResource(id = R.string.name_text),
                                fontFamily = BebasNeue,
                                modifier = Modifier.fillMaxWidth()
                            )
                        },
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Black,
                            unfocusedBorderColor = Color.Black,
                            cursorColor = Color.Black,
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White
                        ),
                        textStyle = TextStyle(fontFamily = BebasNeue)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        onValueChange = {
                        },
                        value = "",
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = stringResource(id = R.string.email_text),
                                modifier = Modifier.fillMaxWidth()
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Black,
                            unfocusedBorderColor = Color.Black,
                            cursorColor = Color.Black,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        ),
                        textStyle = TextStyle(fontFamily = BebasNeue)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    DataNascimentoField()
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        onValueChange = {
                        },
                        value = "",
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = "CPF",
                                modifier = Modifier.fillMaxWidth()
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Black,
                            unfocusedBorderColor = Color.Black,
                            cursorColor = Color.Black,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        ),
                        textStyle = TextStyle(fontFamily = BebasNeue),
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    GeneroField()
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        onValueChange = {
                        },
                        value = "",
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(
                                text = stringResource(id = R.string.address_text),
                                fontFamily = BebasNeue,
                                modifier = Modifier.fillMaxWidth()
                            )
                        },
                        singleLine = true,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.Black,
                            unfocusedBorderColor = Color.Black,
                            cursorColor = Color.Black,
                            focusedTextColor = Color.Black,
                            unfocusedTextColor = Color.Black
                        ),
                        textStyle = TextStyle(fontFamily = BebasNeue)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = stringResource(id = R.string.empty_fields_error),
                        color = Color.Red,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RectangleShape,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Black,
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = stringResource(id = R.string.register_button),
                            fontSize = 18.sp,
                            fontFamily = BebasNeue
                        )
                    }
                }
            }

        }
    }

}

