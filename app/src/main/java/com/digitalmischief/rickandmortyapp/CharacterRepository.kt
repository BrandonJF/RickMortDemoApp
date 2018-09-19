package com.digitalmischief.rickandmortyapp

import com.digitalmischief.rickandmortyapp.models.Result
import com.digitalmischief.rickandmortyapp.network.RickAndMortyService
import rx.Observable

object CharacterRepository {
    private val api: RickAndMortyService by lazy {
        RickAndMortyService.create()
    }

    fun getCharacters(): Observable<List<Result>>{
        return api.getAllCharacters().map { it.results }
    }
}