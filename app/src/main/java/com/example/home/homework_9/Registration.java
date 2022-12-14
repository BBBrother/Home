package com.example.home.homework_9;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        registration();
    }

    static boolean isInputCorrect(String data) {
        String testWord = "[A-Za-z\\d_]{1,20}";
        if (data.matches(testWord)) {
            return true;
        } else {
            return false;
        }
    }

    static void receptionLoginAndPassword(String login, String password, String correctPassword) throws WrongLoginException, WrongPasswordException {
        if (isInputCorrect(login)) {
            System.out.println("Логин принят");
        } else {
            throw new WrongLoginException("Некоректно введён логин");
        }
        if (isInputCorrect(password)) {
            System.out.println("Пароль принят");
        } else {
            throw new WrongPasswordException("Некорректно введён пароль");
        }
        if (correctPassword.equals(password)) {
            System.out.println("Пароли совпадают");
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    static void registration() throws WrongLoginException, WrongPasswordException {
        Scanner in = new Scanner(System.in);
        System.out.println("Логин должен содержать только латинские буквы, цифры и знак подчеркивания. Длина логина должна быть меньше 20 символов. \nВведите логин");
        String login = in.nextLine();

        System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания. Длина пароля должна быть меньше 20 символов. \nВведите пароль");
        String password = in.nextLine();

        System.out.println("Повторно введите пароль");
        String confirmPassword = in.nextLine();
        try {
            receptionLoginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException errorLogin) {
            throw new WrongLoginException("Некоректный логин");
        } catch (WrongPasswordException errorPassword) {
            throw new WrongPasswordException("Некоректный пароль");
        }
    }
}
