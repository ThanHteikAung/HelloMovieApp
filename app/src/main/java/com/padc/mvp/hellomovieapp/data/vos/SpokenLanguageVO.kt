package com.padc.mvp.hellomovieapp.data.vos

import com.google.gson.annotations.SerializedName

data class SpokenLanguageVO(
    @SerializedName("english_name")
    val englishName: String?,

    @SerializedName("iso_639_1")
    val iSO: String?,

    @SerializedName("name")
    val name: String?,
)