package com.example.home.homework_11;

import java.util.ArrayDeque;
import java.util.Scanner;

public class User {
    private static String userName;
    ArrayDeque<String> message = new ArrayDeque<>();

    public User(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public ArrayDeque<String> getMessage(){
        return message;
    }

    public static String createUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        new User(in.nextLine());
        System.out.println("Пользователь создан");
        return userName;
    }

    public static void sendMessage(String sms, User user){
        user.getMessage().addLast(sms);
        System.out.println("Отправленно "+user.getUserName());
    }

}
