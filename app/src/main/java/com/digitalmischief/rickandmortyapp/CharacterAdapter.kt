package com.digitalmischief.rickandmortyapp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.digitalmischief.rickandmortyapp.models.Result
import com.digitalmischief.rickandmortyapp.viewModels.CharacterViewModel

class CharacterAdapter(private val characters: List<Result> = emptyList()) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return LayoutInflater.from(parent.context).inflate(R.layout.view_character, parent, false).let {
            CharacterViewHolder(it)
        }
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        with(characters[position]){
            CharacterViewModel(image, name, location?.name)
        }.let (holder::bind)
    }

    override fun getItemCount(): Int = characters.size

    class CharacterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(viewModel: CharacterViewModel){

        }
    }
}