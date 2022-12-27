package com.example.home.homework_15;

public class SpeedElevator implements Runnable {
    WaitingRoom people;

    SpeedElevator(WaitingRoom people) {
        this.people = people;
    }

    public void run() {
        while (true) {
            people.speedElevatorRun();
        }
    }
}
