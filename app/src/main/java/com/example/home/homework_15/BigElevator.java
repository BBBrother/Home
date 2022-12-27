package com.example.home.homework_15;

public class BigElevator implements Runnable {
    WaitingRoom people;

    BigElevator(WaitingRoom people) {
        this.people = people;
    }

    public void run() {
        while (true){
            people.bigElevatorRun();
        }
    }
}