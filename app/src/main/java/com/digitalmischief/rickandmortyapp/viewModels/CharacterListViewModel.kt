package com.digitalmischief.rickandmortyapp.viewModels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.digitalmischief.rickandmortyapp.CharacterRepository
import com.digitalmischief.rickandmortyapp.models.Result

class CharacterListViewModel(private val repository: CharacterRepository) : ViewModel() {
    var characterListLiveData: MutableLiveData<List<Result>> = MutableLiveData()

    private fun displayCharacters(){
        repository.getCharacters()
    }

}