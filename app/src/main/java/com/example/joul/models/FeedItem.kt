package com.example.joul.models
import com.google.gson.annotations.SerializedName


data class FeedItem (

    @SerializedName("_id") var Id : String,
    @SerializedName("userId") var userId : String,
    @SerializedName("text") var text : String,
    @SerializedName("likes") var likes : Int,
    @SerializedName("dislikes") var dislikes : Int,
    @SerializedName("comments") var comments : Int,
    @SerializedName("createdAt") var createdAt : String,
    @SerializedName("updatedAt") var updatedAt : String,

)