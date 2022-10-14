package com.padc.mvp.hellomovieapp.network.responses

import com.google.gson.annotations.SerializedName
import com.padc.mvp.hellomovieapp.data.vos.ActorVO

data class GetCreditByMovieResponse(
    @SerializedName("id")
    val id: Int?,

    @SerializedName("cast")
    val cast: List<ActorVO>?,

    @SerializedName("crew")
    val crew: List<ActorVO>?,
)