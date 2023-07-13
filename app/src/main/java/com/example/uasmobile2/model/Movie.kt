package com.example.uasmobile2.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Movie (
    @SerializedName("id")
    val id : String?,

    @SerializedName("tittle")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("overview")
    val overview : String?

) : Parcelable {
    constructor(): this("", "", "", "")
}