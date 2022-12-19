package com.example.home.homework_13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamHomework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество эелементов");
        int arrayListSize = in.nextInt();
        int addNumber = 0;
        ArrayList<Integer> randomNumber = new ArrayList<>();
        while (addNumber < arrayListSize) {
            randomNumber.add((int) (Math.random() * 20));
            addNumber++;
        }

        System.out.println("Ваши начальные элементы: " + randomNumber);

        System.out.println("Длинна масива элементов после всех сортировок: " +
                randomNumber.stream()
                        .distinct()
                        .peek(number -> {
                            if (number >= 7 && number <= 17 && number % 2 == 0) {
                                System.out.println("Чётное в диапазоне 7-17 из ваших элементов: " + number);
                            }
                        })
                        .map(number -> number * 2)
                        .filter(number -> number > 10)
                        .toArray().length);

        System.out.println("Среднее арифметическое: " +
                randomNumber.stream()
                        .distinct()
                        .map(number -> number * 2)
                        .filter(number -> number > 10)
                        .collect(Collectors.averagingInt(number -> number)));

    }
}
