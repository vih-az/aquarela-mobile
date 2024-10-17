package br.senai.sp.jandira.mobile_aquarela.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mobile_aquarela.R

@Composable
fun EsqueceuSuaSenhaTela() {
    Column {
        Box{
            Row {
                Icon(
                    imageVector = Icons.Default.ArrowBack, contentDescription = "", modifier = Modifier.height(30.dp).width(30.dp).background(color = Color(0xff3E7D8D), shape = CircleShape).padding(4.dp), tint = Color.White
                )
            }
        }
        Image(painter = painterResource(id = R.drawable.logo1), contentDescription = " ", modifier = Modifier
            .height(80.dp)
            .width(80.dp))
        Text(text = "Esqueceu sua senha?", fontSize = 18.sp)
        Text(text = "Enviaremos um e-mail com instruções de como redefinir sua senha", fontSize = 12.sp)
        OutlinedTextField(onValueChange = {}, value = " ", colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4)), modifier = Modifier
            .height(40.dp)
            .width(260.dp), label = {Text(text = " ")})
        Button(onClick = { /* TO DO */ }, modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xff3E7D8D),
                        Color(0xff5DA5B7)
                    )
                ), shape = RoundedCornerShape(4.dp)
            )
            .height(40.dp)
            .width(138.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)) {
            Text(text = "Enviar")
        }
    }
}
@Composable
@Preview(showBackground = true)
fun EsqueceuSuaSenhaPreview() {
    EsqueceuSuaSenhaTela()
}
