package com.example.logintrip.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.logintrip.R
import com.example.logintrip.model.Viagens
import java.time.LocalDate

class ViagensRepository {
    @Composable
    fun listarTodasAsViagens(): List<Viagens>{
        val santiago = Viagens(1,
            stringResource(id = R.string.santiago_name),
            stringResource(id = R.string.descricao_santiago),
            dataChegada = LocalDate.of(2019, 2, 18),
            dataPartida = LocalDate.of(2019, 2, 21),
            imagem = painterResource(id = R.drawable.santiago)
        )

        val valparaiso = Viagens(2,
            stringResource(id = R.string.valparaiso_name),
            stringResource(id = R.string.descricao_valparaiso),
            dataChegada = LocalDate.of(2020, 12, 13),
            dataPartida = LocalDate.of(2020, 12, 23),
            imagem = painterResource(id = R.drawable.valparaiso)
        )

        val atacama = Viagens(3,
            stringResource(id = R.string.atacama_name),
            stringResource(id = R.string.descricao_atacama),
            dataChegada = LocalDate.of(2021, 8, 25),
            dataPartida = LocalDate.of(2021, 8, 30),
            imagem = painterResource(id = R.drawable.atacama)
        )

        val torresDelPaine = Viagens(4,
            stringResource(id = R.string.torresDelPaine_name),
            stringResource(id = R.string.descricao_torresDelPaine),
            dataChegada = LocalDate.of(2022, 6, 1),
            dataPartida = LocalDate.of(2022, 6, 12),
            imagem = painterResource(id = R.drawable.patagonia)
        )

        val islaDePascua = Viagens(5,
            stringResource(id = R.string.islaDePascua_name),
            stringResource(id = R.string.descricao_islaDePascua),
            dataChegada = LocalDate.of(2023, 4, 15),
            dataPartida = LocalDate.of(2023, 4, 29),
            imagem = painterResource(id = R.drawable.ilhadepascoa)
        )
        return listOf(santiago,valparaiso,atacama,torresDelPaine,islaDePascua)
    }
}