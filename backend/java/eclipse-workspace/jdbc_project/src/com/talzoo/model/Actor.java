package com.talzoo.model;

public class Actor {
    private String first_name;
    private String last_name;
    private String title;
    private int release_year;
    private double rental_rate;
    
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getRelease_year() {
        return release_year;
    }
    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }
    public double getRental_rate() {
        return rental_rate;
    }
    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    
}
