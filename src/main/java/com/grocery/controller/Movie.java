package com.grocery.controller;

public class Movie implements  Comparable<Movie>{

    private String name;
    private double rating;


    public Movie() {
    }

    @Override
    public int compareTo(Movie o) {
        int rollValue = (int) (this.getRating()- o.getRating());
        int nameValue = this.getName().compareTo(this.getName());
        return (nameValue==0) ? rollValue : nameValue;
    }

    public Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}
