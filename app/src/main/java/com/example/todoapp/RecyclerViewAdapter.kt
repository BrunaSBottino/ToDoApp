package com.example.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.ItemTodoLayoutBinding

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {

    data class Tarefa(val nomeDaTarefa:String, var foiConcluida:Boolean)
    val tarefa = Tarefa("Escovar os dentes", false)
    val listaDeTarefas : List<Tarefa> = listOf(
        tarefa,tarefa,tarefa,tarefa,tarefa,tarefa,tarefa,tarefa,tarefa,tarefa,tarefa,
    )

    class RecyclerViewHolder(val binding:ItemTodoLayoutBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = ItemTodoLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.binding.textViewTaskTitle.text = listaDeTarefas[position].nomeDaTarefa
        holder.binding.checkBox.isChecked = listaDeTarefas[position].foiConcluida
    }

    override fun getItemCount(): Int = listaDeTarefas.size

}