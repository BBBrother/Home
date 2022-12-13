package com.example.home.homework_12;

public class Horse extends Pet{
    private Integer weight;

    public Horse(String name, String breed, Integer weight) {
        super(name, breed);
        this.weight = weight;
    }

    @Override
    public String petInfo() {
        return "Имя: " + this.getName() +", Лошадь породы: " + this.getBreed() +", Вес: " + this.weight;
    }
}