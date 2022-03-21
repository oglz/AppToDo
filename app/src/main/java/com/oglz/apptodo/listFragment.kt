package com.oglz.apptodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oglz.apptodo.adapter.TarefaAdapter
import com.oglz.apptodo.modelo.Tarefa

class listFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val tarefas = mutableListOf(
            Tarefa(
                "Estudar",
                "Vai ler um livro.",
                "Alex",
                "21.mar.2022",
                "Dia a Dia",
                true)
        )
        Tarefa(
            "Comprar queijo de cabra",
            "R$50,00 no mercadinho da esquina",
            "Alex",
            "22.mar.2022",
            "Afazeres",
            false)

        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recycler)
        val adapterTarefa = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)
        recyclerTarefa.adapter = adapterTarefa
        recyclerTarefa.setHasFixedSize(true)
        adapterTarefa.setLista(tarefas)

        return view
    }
}