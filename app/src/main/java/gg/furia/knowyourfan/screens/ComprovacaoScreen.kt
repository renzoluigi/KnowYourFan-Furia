package gg.furia.knowyourfan.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import gg.furia.knowyourfan.components.TopBarPadrao

@Composable
fun ComprovacaoScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(topBar = { TopBarPadrao("Comprovação de informações") }) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {

            }
        }
    }
}

