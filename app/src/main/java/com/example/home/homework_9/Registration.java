package com.example.home.homework_9;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        osnova();

    }

    static void osnova() throws WrongLoginException, WrongPasswordException {
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Логин должен содержать только латинские буквы, цифры и знак подчеркивания. Длина логина должна быть меньше 20 символов. \nВведите логин");
            String login = in.nextLine();
            checkLogin(login);
            System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания. Длина пароля должна быть меньше 20 символов. \nВведите пароль");
            String password = in.nextLine();
            checkPassword(password);
            String correctPassword = in.nextLine();
            matchPassword(correctPassword, password);
        } catch (WrongPasswordException | WrongLoginException error) {
            System.out.println("Ощибка ввода данных");
        }
    }

    static void checkLogin(String verificationLogin) throws WrongLoginException {

        if (verificationLogin.matches("[A-Za-z\\d_]{1,20}")) {
            System.out.println("Логин принят");
        } else {
            throw new WrongLoginException("Некоректно введён логин");
        }
    }

    static void checkPassword(String verificationPassword) throws WrongPasswordException {
        if (verificationPassword.matches("[A-Za-z\\d_]{1,20}")) {
            System.out.println("Введите пароль ещё раз");
        } else {
            throw new WrongPasswordException("Некорректно введён пароль");
        }
    }

    static void matchPassword(String matchPassword, String password) {
        if (matchPassword.equals(password)) {
            System.out.println("Пароль принят");
        } else {
            System.out.println("Пароли не совпадают");
        }
    }
}
