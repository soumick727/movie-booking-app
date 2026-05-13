package com.example.moviebooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Inox implements CinemaIF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cinemaName;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Screen> screens;

    public Inox() {
    }

    public Inox(Long id, String cinemaName, User user, List<Screen> screens) {
        this.id = id;
        this.cinemaName = cinemaName;
        this.user = user;
        this.screens = screens;
    }

    public Long getId() {
        return id;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
}