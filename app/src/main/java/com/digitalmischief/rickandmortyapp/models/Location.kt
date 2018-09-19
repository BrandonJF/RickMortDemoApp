package com.digitalmischief.rickandmortyapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Location : Serializable {

    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("url")
    @Expose
    var url: String? = null

    companion object {
        private const val serialVersionUID = -5134607513933698458L
    }

}
