package com.digitalmischief.rickandmortyapp.viewModels

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.digitalmischief.rickandmortyapp.CharacterRepository
import com.digitalmischief.rickandmortyapp.models.Result
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription

class CharacterListViewModel(private val repository: CharacterRepository) : ViewModel() {
    var characterListLiveData: MutableLiveData<List<Result>> = MutableLiveData()
    var compositeSubscription = CompositeSubscription()

    init {

    }

    private fun fetchCharacters(){
        repository.getCharacters()
                .subscribeOn(Schedulers.io())
                .subscribe {
                    characterListLiveData.postValue(it)
                }.let(compositeSubscription::add)
    }

    private fun displayCharacters(){
        repository.getCharacters()
    }

    override fun onCleared() {
        compositeSubscription.clear()
    }

}