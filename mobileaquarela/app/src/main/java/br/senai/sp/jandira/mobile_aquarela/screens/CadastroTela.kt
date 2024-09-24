package br.senai.sp.jandira.mobile_aquarela.screens

import android.util.Log
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Cake
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.GMobiledata
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PermIdentity
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mobile_aquarela.model.Cadastro
import br.senai.sp.jandira.mobile_aquarela.model.Result
import br.senai.sp.jandira.mobile_aquarela.service.RetrofitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun CadastroTela(){
    Surface(modifier = Modifier.fillMaxSize(), color = Color(0xffE2E8EB)){
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly){
            var nomeCompletoState by remember{
                mutableStateOf(" ")}
            var apelidoState by remember {
                mutableStateOf("")
            }
            var emailState by remember {
                mutableStateOf("")
            }
            var senhaState by remember {
                mutableStateOf("")}
            var cpfState by remember {
                mutableStateOf(" ")
            }
            var dataDeNascimentoUsuarioState by remember {
                mutableStateOf(" ")
            }
            var telefoneUsuarioState by remember {
                mutableStateOf(" ")
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)){
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
Text(text = "Cadastre-se", fontSize = 32.sp, color = Color(0xff3E7D8D), fontWeight = FontWeight.Medium)
                Text(text = "Crie uma nova conta", fontSize = 14.sp, color = Color(0xff5DA5B7))
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(500.dp), horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly){
                OutlinedTextField(value = nomeCompletoState, onValueChange = {nomeCompletoState = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent, focusedContainerColor = Color(0xffB8CED4)), label = {
                    Text(text = "Nome completo")}, leadingIcon = { Icon(imageVector = Icons.Default.PermIdentity, contentDescription = " ") })
                OutlinedTextField(value = apelidoState, onValueChange = {apelidoState = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent, focusedContainerColor = Color(0xffB8CED4)), label = {Text(text = "Apelido")})
                OutlinedTextField(value = emailState, onValueChange = {emailState = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent, focusedContainerColor = Color(0xffB8CED4)), label = {Text(text = "Email")}, leadingIcon = {
                    Icon(imageVector = Icons.Default.Email, contentDescription = " ")})
                OutlinedTextField(value = senhaState, onValueChange = {senhaState = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent, focusedContainerColor = Color(0xffB8CED4)), label = {Text(text = "Senha")}, leadingIcon = {
                    Icon(imageVector = Icons.Default.Lock, contentDescription = " ")})
                OutlinedTextField(value = cpfState, onValueChange = {cpfState = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent, focusedContainerColor = Color(0xffB8CED4)), label = {Text(text = "Cpf")})
                OutlinedTextField(value = dataDeNascimentoUsuarioState, onValueChange = {dataDeNascimentoUsuarioState = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent, focusedContainerColor = Color(0xffB8CED4)), label = {Text(text = "Data de nascimento")}, leadingIcon = {
                    Icon(imageVector = Icons.Default.Cake, contentDescription = "")})
                OutlinedTextField(value = telefoneUsuarioState, onValueChange = {telefoneUsuarioState = it}, colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color(0xffB8CED4), unfocusedBorderColor = Color.Transparent, focusedContainerColor = Color(0xffB8CED4)), label = {Text(text = "Telefone")}, leadingIcon = {
                    Icon(imageVector = Icons.Default.Phone, contentDescription = " ")})
            }
            Button(onClick = {
                val callUsuarios = RetrofitFactory().pegarCadastroService().inserirUsuarios(
                    cadastros = Cadastro(
                        nome = nomeCompletoState,
                        nome_usuario = apelidoState,
                        foto_usuario = null,
                        descricao = null,
                        email = emailState,
                        senha = senhaState,
                        cpf = cpfState,
                        data_nascimento = dataDeNascimentoUsuarioState,
                        telefone = telefoneUsuarioState,
                        disponibilidade = null,
                        user_stats = true
                    )
                )
                callUsuarios.enqueue(object : Callback<Result>{
                    override fun onResponse(p0: Call<Result>, p1: Response<Result>) {
                        Log.i("foi", p1.body().toString())
                    }

                    override fun onFailure(p0: Call<Result>, p1: Throwable) {
                        Log.i("falhou", p1.toString())
                    }
                })},modifier = Modifier
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
Text(text = "Cadastrar", fontSize = 20.sp)
            }
            HorizontalDivider(modifier = Modifier
                .height(10.dp)
                .width(10.dp))
            Text(text = "ou")
            Row(modifier = Modifier
                .background(
                    color = Color(0xff3E7D8D), shape = RoundedCornerShape(20.dp)
                )
                .width(270.dp)
                .height(35.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
Icon(imageVector = Icons.Default.GMobiledata, contentDescription = " ", tint = Color.White)
                Text(text = "Cadastre com o google", color = Color.White)
            }
        }
    }
}
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun CadastroTelaPreview(){
    CadastroTela()
}