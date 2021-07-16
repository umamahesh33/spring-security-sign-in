package com.example.springsecuritysignin.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.lang.Nullable;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;

@Entity
public class myUser{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    public myUser(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public myUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
