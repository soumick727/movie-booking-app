package com.example.moviebooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
@NamedQuery(
    name = "User.findByUsername",
    query = "SELECT u FROM User u WHERE u.username = :username"
)
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PVR> pvrList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Inox> inoxList;

    

    public User() {
    }

    public User(String username, String password, List<PVR> pvrList, List<Inox> inoxList) {
        this.username = username;
        this.password = password;
        this.pvrList = pvrList;
        this.inoxList = inoxList;
    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<PVR> getPvrList() {
        return pvrList;
    }

    public void setPvrList(List<PVR> pvrList) {
        this.pvrList = pvrList;
    }

    public List<Inox> getInoxList() {
        return inoxList;
    }

    public void setInoxList(List<Inox> inoxList) {
        this.inoxList = inoxList;
    }
}
