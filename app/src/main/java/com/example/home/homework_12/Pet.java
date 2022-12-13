package com.example.home.homework_12;

public abstract class Pet {
    private final String name;
    private final String breed;

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

    public abstract String petInfo();
}
