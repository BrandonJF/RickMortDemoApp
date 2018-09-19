package com.digitalmischief.rickandmortyapp.models

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Origin : Serializable {

    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("url")
    @Expose
    var url: String? = null

    companion object {
        private const val serialVersionUID = 8762502284783181290L
    }

}
