package com.ulp.tp_3.models;

import java.io.Serializable;

public class Movie implements Serializable {
    private String title, plot, director, protagosits;
    private int cover_id;

    public Movie(String title, String plot, String director, String protagosits, int cover_id) {
        this.title = title;
        this.plot = plot;
        this.director = director;
        this.protagosits = protagosits;
        this.cover_id = cover_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProtagosits() {
        return protagosits;
    }

    public void setProtagosits(String protagosits) {
        this.protagosits = protagosits;
    }

    public int getCover_id() {
        return cover_id;
    }

    public void setCover_id(int cover_id) {
        this.cover_id = cover_id;
    }
}
