package com.driver;

public class Movie {

    private String name ;

    private int durationInMinutes;

    private double imbdRating;

    public Movie() {
    }

    public Movie(String name, int durationInMinutes, double imbdRating) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
        this.imbdRating = imbdRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImbdRating() {
        return imbdRating;
    }

    public void setImbdRating(double imbdRating) {
        this.imbdRating = imbdRating;
    }
}
