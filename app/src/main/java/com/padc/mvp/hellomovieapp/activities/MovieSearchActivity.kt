package com.padc.mvp.hellomovieapp.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.jakewharton.rxbinding4.widget.textChanges
import com.padc.mvp.hellomovieapp.R
import com.padc.mvp.hellomovieapp.adapters.MovieListAdapter
import com.padc.mvp.hellomovieapp.data.models.MovieModelImpl
import com.padc.mvp.hellomovieapp.delegates.MovieViewHolderDelegate
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_movie_search.*
import java.util.concurrent.TimeUnit

class MovieSearchActivity : AppCompatActivity(), MovieViewHolderDelegate {

    private lateinit var mMovieListAdapter: MovieListAdapter

    private val mMovieModel = MovieModelImpl

    companion object{
        fun newIntent(context: Context): Intent {
            return Intent(context,MovieSearchActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_search)
        setUpRecyclerView()
        setUpListeners()

    }

    private fun setUpListeners(){
        etSearch.textChanges()
            .debounce(500L,TimeUnit.MILLISECONDS)
            .flatMap { mMovieModel.searchMovie(it.toString()) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                mMovieListAdapter.setNewData(it)
            },{
                showError(it.localizedMessage ?: "")
            })

    }

    private fun setUpRecyclerView(){
        mMovieListAdapter = MovieListAdapter(this)
        rvMovies.adapter = mMovieListAdapter
        rvMovies.layoutManager = GridLayoutManager(this,2)
    }

    private fun showError(errorMsg: String) {
        Snackbar.make(window.decorView, errorMsg, Snackbar.LENGTH_SHORT).show()
    }

    override fun onTapMovieItem(movieId: Int) {

    }
}