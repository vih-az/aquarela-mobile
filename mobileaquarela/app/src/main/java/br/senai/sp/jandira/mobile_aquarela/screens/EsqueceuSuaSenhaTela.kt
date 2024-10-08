package br.senai.sp.jandira.mobile_aquarela.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mobile_aquarela.R

@Composable
fun EsqueceuSuaSenhaTela(){
    Column {
        Box {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
        }
        Image(painter = painterResource(id = R.drawable.Logo1), contentDescription = " ")
        Text(text = "Esqueceu sua senha?")
        Text(text = "Enviaremos um e-mail com instruções de como redefinir sua senha")
        OutlinedTextField(onValueChange = {}, value = " ")
    }