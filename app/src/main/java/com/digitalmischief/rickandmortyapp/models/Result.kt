package com.digitalmischief.rickandmortyapp.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Result : Serializable {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("species")
    @Expose
    var species: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("gender")
    @Expose
    var gender: String? = null
    @SerializedName("origin")
    @Expose
    var origin: Origin? = null
    @SerializedName("location")
    @Expose
    var location: Location? = null
    @SerializedName("image")
    @Expose
    var image: String? = null
    @SerializedName("episode")
    @Expose
    var episode: List<String>? = null
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("created")
    @Expose
    var created: String? = null

    companion object {
        private const val serialVersionUID = 1540894862446572860L
    }

}
