package br.senai.sp.jandira.mobile_aquarela.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.GMobiledata
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CadastroTela(){
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xffE2E8EB)){
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
            Row(modifier = Modifier.fillMaxWidth()){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "icon",
                    tint = Color.White,
                    modifier = Modifier
                        .background(color = Color(0xff3E7D8D), shape = CircleShape)
                        .padding(4.dp)
                )
            }
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
Text(text = "Cadastre-se", fontSize = 32.sp)
                Text(text = "Crie uma nova conta", fontSize = 14.sp)
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(500.dp), horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly){
                OutlinedTextField(value = "", onValueChange = {}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent), label = {
                    Text(text = "Nome completo")})
                OutlinedTextField(value = "", onValueChange = {}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent), label = {Text(text = "Apelido")})
                OutlinedTextField(value = "", onValueChange = {}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent))
                OutlinedTextField(value = "", onValueChange = {}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent))
                OutlinedTextField(value = "", onValueChange = {}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent))
                OutlinedTextField(value = "", onValueChange = {}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent))
                OutlinedTextField(value = "", onValueChange = {}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent))
            }
            Button(onClick = {}, modifier = Modifier
                    .width(270.dp)
                    .height(50.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xff5DA5B7),
                                Color(0xff3E7D8D)
                            )
                        )
                    ),
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent
                )
            ) {
Text(text = "Cadastrar")
            }
            HorizontalDivider(modifier = Modifier
                .height(10.dp)
                .width(10.dp))
            Text(text = "ou")
            Row {
Icon(imageVector = Icons.Default.GMobiledata, contentDescription = " ")
                Text(text = "Cadastre com o google")
            }
        }
    }
}
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun CadastroTelaPreview(){
    CadastroTela()
}