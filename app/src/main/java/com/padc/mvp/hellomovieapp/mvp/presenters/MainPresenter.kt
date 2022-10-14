package com.padc.mvp.hellomovieapp.mvp.presenters

import com.padc.mvp.hellomovieapp.delegates.BannerViewHolderDelegate
import com.padc.mvp.hellomovieapp.delegates.MovieViewHolderDelegate
import com.padc.mvp.hellomovieapp.delegates.ShowcasesViewHolderDelegate
import com.padc.mvp.hellomovieapp.mvp.views.MainView

interface MainPresenter : IBasePresenter, BannerViewHolderDelegate, MovieViewHolderDelegate,
    ShowcasesViewHolderDelegate {
        fun initView(view : MainView)
        fun onTapGenre(genrePosition: Int)
}