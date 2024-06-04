package com.example.logintrip.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.logintrip.model.Cadastro

@Dao
interface CadastroDao {
    @Insert
    fun salvar(cadastro: Cadastro): Long

    @Update
    fun atualizar(cadastro: Cadastro): Int

    @Delete
    fun excluir(cadastro: Cadastro): Int

    @Query("SELECT * FROM tbl_cadastro ORDER BY nome ASC")
    fun listarTodosOsCadastros():List<Cadastro>

    @Query("SELECT * FROM tbl_cadastro WHERE id = :id")
    fun buscarContatoPeloId(id: Long):Cadastro

    @Query("SELECT * FROM tbl_cadastro where nome = :nome order by nome asc")
    fun buscarUsuarioPeloNome(nome: String): List<Cadastro>

    @Query("SELECT * FROM tbl_cadastro WHERE email = :email")
    fun buscarUsuarioPeloEmail(email: String): Cadastro?

    @Query("SELECT * from tbl_cadastro where email= :email and senha = :senha")
    fun login(email: String, senha:String): Cadastro?
}