package com.example.springshop.domain;


import jakarta.persistence.Entity;

@Entity
public class Album extends Item{
    private String artist;
    private String etc;
}
