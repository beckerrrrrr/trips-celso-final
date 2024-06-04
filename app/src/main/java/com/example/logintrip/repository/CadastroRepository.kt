package com.example.logintrip.repository

import android.content.Context
import com.example.logintrip.dao.CadastroDb
import com.example.logintrip.model.Cadastro

class CadastroRepository (context: Context){

       private val db = CadastroDb.getBancoDeDados(context).contatoDao()

    fun salvar(cadastro: Cadastro): Long{
        return db.salvar(cadastro)
    }

    fun buscarTodosOsUsuariois(): List<Cadastro>{
        return db.listarTodosOsCadastros()
    }

    fun buscarUsuarioPeloId(id: Long): Cadastro{
        return db.buscarContatoPeloId(id)
    }
    fun login (email:String, senha:String): Pair<Boolean, Cadastro?> {
        var usuario = db.login(email, senha)
        return Pair(usuario != null, usuario)
    }
    }
