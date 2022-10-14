package com.padc.mvp.hellomovieapp.network.responses

import com.google.gson.annotations.SerializedName
import com.padc.mvp.hellomovieapp.data.vos.DateVO
import com.padc.mvp.hellomovieapp.data.vos.MovieVO

data class MovieListResponse(
    @SerializedName("page")
    val page: Int?,
    @SerializedName("dates")
    val dates: DateVO?,
    @SerializedName("results")
    val results: List<MovieVO>?
)