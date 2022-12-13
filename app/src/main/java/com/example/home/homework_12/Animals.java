package com.example.home.homework_12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Animals {
    static HashMap<String, Pet> animals = new HashMap<>();

    public static void main(String[] args) {
        createPet();
        printPetInfo();
        deletePet();
    }

    private static void createPet() {
        Pet comochek = new Cat("Комочек", "Мэйн-кун", 5);
        Pet bleaks = new Cat("Блэкс", "Дворовой", 12);
        Pet drujok = new Dog("Дружок", "Лайка", 4);
        Pet pirojok = new Dog("Пирожок", "Такса", 3);
        Pet genry = new Horse("Генри", "Пони", 70);
        Pet bycifal = new Horse("Буцифал", "Орловский рысак", 525);
        animals.put(comochek.getName(), comochek);
        animals.put(bleaks.getName(), bleaks);
        animals.put(drujok.getName(), drujok);
        animals.put(pirojok.getName(), pirojok);
        animals.put(genry.getName(), genry);
        animals.put(bycifal.getName(), bycifal);
    }

    private static void printPetInfo() {
        for (Pet pet : animals.values()) {
            System.out.println(pet.petInfo());
        }
    }

    private static void deletePet() {
        Scanner in = new Scanner(System.in);
        while (!animals.isEmpty()) {
            System.out.println("Введите имя житвотного которого хотите удалить или \"Стоп\" для остановки программы:");
            String deletePetName = in.nextLine();
            Set<String> listAnimals = animals.keySet();
            if (deletePetName.equals("Стоп")) {
                System.out.println("Всего хорошего!");
                break;
            } else {
                if (listAnimals.remove(deletePetName)) {
                    animals.remove(deletePetName);
                    System.out.println("Остались:");
                    printPetInfo();
                } else {
                    System.out.println("Некорректный ввод. Повторите операцию");
                    continue;
                }
            }
        }
    }
}