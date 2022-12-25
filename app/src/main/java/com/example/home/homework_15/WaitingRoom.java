package com.example.home.homework_15;

import java.util.Scanner;

public class WaitingRoom {
    private static final int CAPACITY_BIG_ELEVATOR = 10;
    private static final int CAPACITY_SPEED_ELEVATOR = 6;

    static Scanner in = new Scanner(System.in);
    private volatile int people = 0;

    public void bigElevatorRun() {
        try {
            Thread.sleep(2000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        if (people > 0) {
            int newPeople = people - CAPACITY_BIG_ELEVATOR;
            people = newPeople;
            System.out.println("Большой лифт поднял 10 человек");
        } else {
            System.out.println("Введите количество людей");
            people = in.nextInt();
        }
    }

    public void speedElevatorRun() {
        try {
            Thread.sleep(1000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        if (people > 0) {
            int newPeople = people - CAPACITY_SPEED_ELEVATOR;
            people = newPeople;
            System.out.println("Быстрый лифт поднял 6 человек");
        }
    }
}
