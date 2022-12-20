package com.example.home.homework_14;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {
    private static int callNumberCheck = 0;

    public static void main(String[] args) {
        List<IncomingCall> listOfCalls = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            listOfCalls.add(new IncomingCall());
        }

        Runnable calls = () -> {
            for (int callNumber = 0; callNumber < 8; callNumber++) {
                listOfCalls.add(new IncomingCall());
                synchronized (listOfCalls) {
                    if (callNumber == callNumberCheck) {
                        System.out.print((callNumber + 1) + ".");
                        listOfCalls.get(callNumber).callInfo(Thread.currentThread().getName());
                        callNumberCheck++;
                        try {
                            Thread.sleep(1000);
                        } catch (Exception exception) {
                            exception.getStackTrace();
                        }
                    }
                }
            }
        };

        Thread call1 = new Thread(calls);
        Thread call2 = new Thread(calls);
        Thread call3 = new Thread(calls);

        call1.setName("Снежанна.");
        call2.setName("Жасмин.");
        call3.setName("Кристалла.");

        call1.start();
        call2.start();
        call3.start();
    }
}
