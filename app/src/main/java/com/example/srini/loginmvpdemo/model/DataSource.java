package com.example.srini.loginmvpdemo.model;

import java.util.ArrayList;
import java.util.List;

import homeScreen.HomeContract;

/**
 * Created by SRINI on 10/21/2018.
 */

public class DataSource implements HomeContract.PrsntrReqModel {

    HomeContract.Presenter ipresenter;
    HomeContract.ModelRespondPresenter modelRespondPresenter;

    public DataSource(HomeContract.ModelRespondPresenter modelRespondPresenter) {
        this.modelRespondPresenter = modelRespondPresenter;

    }
    private List<Data> movieList = new ArrayList();

    Data movie1 = new Data("Mad Max: Fury Road", "Action & Adventure", "2015");
    Data movie2 = new Data("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
    Data movie3 = new Data("Shaun the Sheep", "Animation", "2015");
    Data movie4 = new Data("The Martian", "Science Fiction & Fantasy", "2015");
    Data movie5 = new Data("Mission: Impossible Rogue Nation", "Action", "2015");

    private List<Data> getMovieList () {
        movieList.clear();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        return movieList;
    }
    @Override
    public void giveMoviesList() {

        modelRespondPresenter.getMoviesList(getMovieList());
    }
}
