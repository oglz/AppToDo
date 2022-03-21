package com.oglz.apptodo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.oglz.apptodo.R
import com.oglz.apptodo.modelo.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.tarefaView>(){

    private var listaTarefa = emptyList<Tarefa>()

    class tarefaView (view: View): RecyclerView.ViewHolder(view){
        val txtNome = view.findViewById<TextView>(R.id.tarefaText)
        val txtDesc = view.findViewById<TextView>(R.id.descText)
        val txtResp = view.findViewById<TextView>(R.id.responsavelText)
        val txtData = view.findViewById<TextView>(R.id.dataText)
        val txtCate = view.findViewById<TextView>(R.id.categoriaText)
        val switchAndamento = view.findViewById<Switch>(R.id.switchAndamento)
        val botaoDelete = view.findViewById<Button>(R.id.botaoDelete)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tarefaView {

        val cardView = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout, parent, false)
        return tarefaView(cardView)
    }

    override fun onBindViewHolder(holder: tarefaView, position: Int) {
        val tarefaList = listaTarefa[position]

        holder.txtNome.text = tarefaList.tarefa
        holder.txtDesc.text = tarefaList.descricao
        holder.txtResp.text = tarefaList.responsavel
        holder.txtData.text = tarefaList.data
        holder.txtCate.text = tarefaList.categoria
        holder.switchAndamento.isChecked = tarefaList.andamento

    }

    override fun getItemCount(): Int {
        return listaTarefa.size
    }
    fun setLista(lista: List<Tarefa>){
        listaTarefa = lista
        notifyDataSetChanged()
    }
}