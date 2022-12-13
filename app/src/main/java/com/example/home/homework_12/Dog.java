package com.example.home.homework_12;

public class Dog extends Pet{
    private Integer legs;

    public Dog(String name, String breed, Integer legs) {
        super(name, breed);
        this.legs = legs;
    }

    @Override
    public String petInfo() {
        return "Имя: " + this.getName() +", Пёс породы: " + this.getBreed() +", Количество ног: " + this.legs;
    }
}
