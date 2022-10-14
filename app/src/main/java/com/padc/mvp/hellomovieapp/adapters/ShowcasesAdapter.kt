package com.padc.mvp.hellomovieapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padc.mvp.hellomovieapp.R
import com.padc.mvp.hellomovieapp.data.vos.MovieVO
import com.padc.mvp.hellomovieapp.delegates.ShowcasesViewHolderDelegate
import com.padc.mvp.hellomovieapp.viewholders.ShowcasesViewHolder

class ShowcasesAdapter(val mDelegate: ShowcasesViewHolderDelegate) :
    RecyclerView.Adapter<ShowcasesViewHolder>() {

    private var mMovieList: List<MovieVO> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowcasesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_showcases, parent, false)
        return ShowcasesViewHolder(view, mDelegate)
    }

    override fun onBindViewHolder(holder: ShowcasesViewHolder, position: Int) {
        if (mMovieList.isNotEmpty()) {
            holder.bindData(mMovieList[position])
        }
    }

    override fun getItemCount(): Int = mMovieList.size

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(movieList: List<MovieVO>) {
        mMovieList = movieList
        notifyDataSetChanged()
    }
}