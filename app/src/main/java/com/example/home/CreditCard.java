package com.example.home;

import java.util.Scanner;

public class CreditCard {
    int cardNumber;
    int balance;
    public CreditCard(int cardNumber, int balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }
    public void deposit(){
        Scanner add = new Scanner(System.in);
        System.out.println("Введите сколько денег хотите положить на карту "+cardNumber);
        this.balance = balance + add.nextInt();
    }

    public void withdraw(){
        Scanner remove = new Scanner(System.in);
        System.out.println("Введите сколько денег хотите снять с карты "+cardNumber);
        int innerRemove = remove.nextInt();
        if (innerRemove>=balance){
        this.balance = balance - innerRemove;
        } else {
            System.out.println("Недостаточно денег");
        }

    }

    public void cardInfo(){
        System.out.println("На карте:"+cardNumber+" находиться "+balance+" денег ");
    }
}
