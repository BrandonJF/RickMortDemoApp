package com.digitalmischief.rickandmortyapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.io.Serializable

class CharacterResponse : Serializable {

    @SerializedName("info")
    @Expose
    var info: Info? = null
    @SerializedName("results")
    @Expose
    var results: List<Result>? = null

    companion object {
        private const val serialVersionUID = -2157854523077664876L
    }

}
