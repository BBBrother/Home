package com.example.home.homework_12;

public class Cat extends Pet {
    private final int age;

    public Cat(String name, String breed, Integer age) {
        super(name, breed);
        this.age = age;
    }

    @Override
    public String petInfo() {
        return "Имя: " + this.getName() +", Кот породы: " + this.getBreed() +", Возраст: " + this.age;
    }
}
