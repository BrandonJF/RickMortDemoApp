package com.digitalmischief.rickandmortyapp.models

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Info : Serializable {

    @SerializedName("count")
    @Expose
    var count: Int? = null
    @SerializedName("pages")
    @Expose
    var pages: Int? = null
    @SerializedName("next")
    @Expose
    var next: String? = null
    @SerializedName("prev")
    @Expose
    var prev: String? = null

    companion object {
        private const val serialVersionUID = -8876679528076280241L
    }

}
