package com.padc.mvp.hellomovieapp.mvp.views

import com.padc.mvp.hellomovieapp.data.vos.ActorVO
import com.padc.mvp.hellomovieapp.data.vos.MovieVO

interface MovieDetailsView: BaseView {
    fun showMovieDetails(movie: MovieVO)
    fun showCreditsByMovie(cast: List<ActorVO>,crew: List<ActorVO>)
    fun navigateBack()
}