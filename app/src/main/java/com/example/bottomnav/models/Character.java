package com.example.bottomnav.models;

public class Character {
    private String name;
    private int img;

    public Character(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

}
