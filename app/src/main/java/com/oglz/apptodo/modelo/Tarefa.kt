package com.oglz.apptodo.modelo

data class Tarefa
    (var tarefa: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var categoria: String,
    var andamento: Boolean){
}