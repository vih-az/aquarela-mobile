package br.senai.sp.jandira.mobile_aquarela.model

import java.util.Date

data class Cadastro(
    val nome: String = "",
    val nome_usuario: String = "",
    val foto_usuario: String = "",
    val descricao: String = "",
    val email: String = "",
    val senha: String = "",
    val cpf: String = "",
    val data_nascimento: Date,
    val telefone: String = "",
    val disponibilidade: Boolean,
    val user_stats: Boolean
)
