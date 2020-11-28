package com.vortexmind.model;

public class Movie {
    private String id;
    private String movieName;
    private String movieYear;

    public Movie(String id, String movieName, String movieYear) {
        this.id = id;
        this.movieName = movieName;
        this.movieYear = movieYear;
    }

    public String getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieYear() {
        return movieYear;
    }
}
