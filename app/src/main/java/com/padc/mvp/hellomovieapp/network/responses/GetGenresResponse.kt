package com.padc.mvp.hellomovieapp.network.responses

import com.google.gson.annotations.SerializedName
import com.padc.mvp.hellomovieapp.data.vos.GenreVO

data class GetGenresResponse(

    @SerializedName("genres")
    val genres: List<GenreVO>?
)