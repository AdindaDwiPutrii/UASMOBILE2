package com.example.uasmobile2.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class TVResponse (
    @SerializedName("result")
    val tv : List<TV>

): Parcelable {
    constructor(): this(mutableListOf())
}