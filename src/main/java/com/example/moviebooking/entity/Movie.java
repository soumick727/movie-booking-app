package com.example.moviebooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String releaseDate;
    private String showCycle;

    public Movie() {
    }
    public Movie(String title, String releaseDate, String showCycle) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.showCycle = showCycle;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    public String getShowCycle() {
        return showCycle;
    }
    public void setShowCycle(String showCycle) {
        this.showCycle = showCycle;
    }


}
