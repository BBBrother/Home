package com.example.home.homework_15;

public class Lift {
    public static void main(String[] args) {
        WaitingRoom waitingRoom = new WaitingRoom();
        BigElevator bigElevator = new BigElevator(waitingRoom);
        SpeedElevator speedElevator = new SpeedElevator(waitingRoom);
        new Thread(speedElevator).start();
        new Thread(bigElevator).start();
    }
}
