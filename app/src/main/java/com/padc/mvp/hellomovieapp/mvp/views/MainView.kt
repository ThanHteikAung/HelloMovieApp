package com.padc.mvp.hellomovieapp.mvp.views

import com.padc.mvp.hellomovieapp.data.vos.ActorVO
import com.padc.mvp.hellomovieapp.data.vos.GenreVO
import com.padc.mvp.hellomovieapp.data.vos.MovieVO

interface MainView: BaseView {
    fun showNowPlayingMovies(nowPlayingMovies: List<MovieVO>)
    fun showPopularMovies(popularMovies: List<MovieVO>)
    fun showTopRatedMovies(topRatedMovies: List<MovieVO>)
    fun showGenres(genreList: List<GenreVO>)
    fun showMoviesByGenre(moviesByGenre: List<MovieVO>)
    fun showActors(actors: List<ActorVO>)
    fun navigateToMovieDetailsScreen(movieId: Int)
}