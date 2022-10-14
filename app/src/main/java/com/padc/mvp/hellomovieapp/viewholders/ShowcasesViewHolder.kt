package com.padc.mvp.hellomovieapp.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.padc.mvp.hellomovieapp.data.vos.MovieVO
import com.padc.mvp.hellomovieapp.delegates.ShowcasesViewHolderDelegate
import com.padc.mvp.hellomovieapp.utils.IMAGE_BASE_URL
import kotlinx.android.synthetic.main.view_holder_showcases.view.*

class ShowcasesViewHolder(itemView: View, private val mDelegate: ShowcasesViewHolderDelegate) :
    RecyclerView.ViewHolder(itemView) {

    private var mMovieVO: MovieVO? = null

    init {
        itemView.setOnClickListener {
            mMovieVO?.let { movie->
                mDelegate.onTapMovieFromShowcase(movie.id)
            }

        }
    }

    fun bindData(movie: MovieVO) {
        mMovieVO = movie

        Glide.with(itemView.context)
            .load("${IMAGE_BASE_URL}${movie.posterPath}")
            .into(itemView.ivShowcases)

        itemView.tvShowcaseMovieName.text = movie.title
        itemView.tvShowcaseMovieDate.text = movie.releaseDate
    }
}