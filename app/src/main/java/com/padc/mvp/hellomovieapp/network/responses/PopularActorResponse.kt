package com.padc.mvp.hellomovieapp.network.responses

import com.google.gson.annotations.SerializedName
import com.padc.mvp.hellomovieapp.data.vos.ActorVO

data class PopularActorResponse(
    @SerializedName("results")
    val results: List<ActorVO>,
)