package com.padc.mvp.hellomovieapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import com.padc.mvp.hellomovieapp.mvp.views.MovieDetailsView

interface MovieDetailsPresenter: IBasePresenter {

    fun initView(view:MovieDetailsView)
    fun onUiReadyInMovieDetails(owner: LifecycleOwner, movieId : Int)
    fun onTapBack()

}