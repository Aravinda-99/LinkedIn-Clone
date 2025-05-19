package com.example.backend.feature.authentication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "users")
public class AuthenticationUser {

    @Id
    private Long id;
    private String username;
    private String password;

    public AuthenticationUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public AuthenticationUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
