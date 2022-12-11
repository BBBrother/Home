package com.example.home.homework_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Messenger {
    static ArrayList<String> userList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Создать пользователя.");
        System.out.println("2. Написать пользователю сообщение.");
        System.out.println("3. Прочитать сообщения.");
        System.out.println("4. Вывести список пользователей");
        System.out.println("9. Вывести все доступные команды.");
        System.out.println("0. Закончить работу.");

        while (true) {
            System.out.println("Введите номер команды.");
            int commandNumber = in.nextInt();
            switch (commandNumber) {
                case 1:
                    userList.add(User.createUser());
                    continue;
                case 2:
                    System.out.println("Кому отправить");
                    User host = new User(in.nextLine());
                    System.out.println("Введите текст сообщения");
                    String message = in.nextLine();
                    User.sendMessage(message,host);
                    continue;
                case 3:

                    continue;
                case 4:
                    System.out.println(userList.toString());
                    continue;
                case 9:
                    System.out.println("1. Создать пользователя.");
                    System.out.println("2. Написать пользователю сообщение.");
                    System.out.println("3. Прочитать сообщения.");
                    System.out.println("4. Вывести список пользователей");
                    System.out.println("9. Вывести все доступные команды.");
                    System.out.println("0. Закончить работу.");
                    continue;
                case 0:
                    System.out.println("Всего хорошего.");
                    break;
            }
            break;
        }
    }
}
