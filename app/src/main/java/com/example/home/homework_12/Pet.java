package com.example.home.homework_12;

public class Pet {
    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    protected String getBreed() {
        return breed;
    }

    public String petInfo() {
        return name+breed;
    }
}
