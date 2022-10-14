package com.padc.mvp.hellomovieapp.mvp.presenters

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import com.padc.mvp.hellomovieapp.data.models.MovieModelImpl
import com.padc.mvp.hellomovieapp.mvp.views.MovieDetailsView

class MovieDetailsPresenterImpl :ViewModel(), MovieDetailsPresenter {

    //Model
    private var mMovieModel = MovieModelImpl

    //View
    private var mView: MovieDetailsView? = null

    override fun initView(view: MovieDetailsView) {
        mView = view
    }

    override fun onUiReadyInMovieDetails(owner: LifecycleOwner, movieId: Int) {
        //Movie Details
        mMovieModel.getMovieDetail(movieId.toString()){
            mView?.showError(it)
        }?.observe(owner){
            it?.let {
                mView?.showMovieDetails(it)
            }
        }

        //Credits
        mMovieModel.getCreditByMovie(movieId.toString(), onSuccess = {
            mView?.showCreditsByMovie(it.first,it.second)
        }, onFailure = {
            mView?.showError(it)
        })
    }

    override fun onTapBack() {
        mView?.navigateBack()
    }

    override fun onUiReady(owner: LifecycleOwner) {

    }
}