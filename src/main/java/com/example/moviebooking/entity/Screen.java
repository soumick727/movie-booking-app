package com.example.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Screen {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long id;
    private String type;

    @OneToOne
    private Movie movie;
    public Screen() {
    }
    public Screen(String type, Movie movie) {
        this.type = type;
        this.movie = movie;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Movie getMovie() {
        return movie;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }


    
}
