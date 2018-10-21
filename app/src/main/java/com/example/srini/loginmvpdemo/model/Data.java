package com.example.srini.loginmvpdemo.model;

/**
 * Created by SRINI on 10/21/2018.
 */

public class Data {
    private String title;
    private String  genere;
    private String year;

    public Data() {
    }

    public Data(String title, String genere, String year) {
        this.title = title;
        this.genere = genere;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }




}
