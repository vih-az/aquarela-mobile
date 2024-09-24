package br.senai.sp.jandira.mobile_aquarela.service

import retrofit2.http.Body
import retrofit2.http.POST

interface CadastroService {
    @POST("/v1/aquarela/inserirUsuarios")
    fun inserirUsuario(@Body Usuario usuario)
}