package br.senai.sp.jandira.mobile_aquarela.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CadastroTela(){
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xffE2E8EB)){
        Column(modifier = Modifier.fillMaxSize()){
            Row {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "icon",
                    tint = Color.White
                )
            }
            Column {
Text(text = "Cadastre-se")
                Text(text = "Crie uma nova conta")
            }
            Column {
OutlinedTextField(value = "", onValueChange = {})
                OutlinedTextField(value = "", onValueChange = {})
                OutlinedTextField(value = "", onValueChange = {})
                OutlinedTextField(value = "", onValueChange = {})
                OutlinedTextField(value = "", onValueChange = {})
                OutlinedTextField(value = "", onValueChange = {})
                OutlinedTextField(value = "", onValueChange = {})
            }
            Button(onClick = {}) {
Text(text = "Cadastrar")
            }
            Text(text = "ou")
            Row {

            }
        }
    }
}
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun CadastroTelaPreview(){
    CadastroTela()
}