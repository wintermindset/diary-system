package com.example.diary_system.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private LevelOfAccess levelOfAccess;

    private enum LevelOfAccess {
        STUDENT, TEACHER
    }
    
    public User(Long id, String name, String email, String password, LevelOfAccess levelOfAccess) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.levelOfAccess = levelOfAccess;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LevelOfAccess getLevelOfAccess() {
        return levelOfAccess;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLevelOfAccess(LevelOfAccess levelOfAccess) {
        this.levelOfAccess = levelOfAccess;
    }
}