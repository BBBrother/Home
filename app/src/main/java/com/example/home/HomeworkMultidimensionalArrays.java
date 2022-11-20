package com.example.home;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeworkMultidimensionalArrays {
    public static void main(String[] args) {
        task1();
        task2();
    }

    static void task1() {
        System.out.println("Задание 1");
        System.out.println("Введите размер двухмерного массива");
        Scanner in = new Scanner(System.in);
        int arrayLine = in.nextInt();
        int arrayColumn = in.nextInt();
        int[][] twoDimensionalArray = new int[arrayLine][arrayColumn];
        for (int[] innerArray : twoDimensionalArray) {
            for (int index = 0; index < innerArray.length; index++) {
                innerArray[index] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Ваш массив выглядит так");
        System.out.println(Arrays.deepToString(twoDimensionalArray));

        int[] oneDimensionalArray = new int[arrayLine * arrayColumn];
        int indexNew = 0;
        for (int[] innerArray : twoDimensionalArray) {
            for (int index = 0; index < innerArray.length; index++) {
                oneDimensionalArray[indexNew] = innerArray[index];
                indexNew++;
            }
        }
        System.out.println("Преобразованный массив");
        System.out.println(Arrays.toString(oneDimensionalArray));
    }

    static void task2() {
        System.out.println("Задание 2");
        System.out.println("Введите размер трёхмерного массива");
        Scanner in = new Scanner(System.in);
        int arrayFirst = in.nextInt();
        int arraySecond = in.nextInt();
        int arrayThird = in.nextInt();
        int[][][] threeDimensionalArray = new int[arrayFirst][arraySecond][arrayThird];
        Random random = new Random();

        for (int[][] firstInnerArray : threeDimensionalArray) {
            for (int[] secondInnerArray : firstInnerArray) {
                for (int index = 0; index < secondInnerArray.length; index++) {
                    secondInnerArray[index] = random.nextInt(10) + 1;
                }
            }
        }
        System.out.println("Массив из случайныйх чисел");
        System.out.println(Arrays.deepToString(threeDimensionalArray));

        String[][][] textArray = new String[arrayFirst][arraySecond][arrayThird];
        String numberName = null;

        for (int firstIndex = 0; firstIndex < arrayFirst; firstIndex++) {
            for (int secondIndex = 0; secondIndex < arraySecond; secondIndex++) {
                for (int thirdIndex = 0; thirdIndex < arrayThird; thirdIndex++) {
                    int number = threeDimensionalArray[firstIndex][secondIndex][thirdIndex];

                    switch (number) {
                        case 1: {numberName = "one";break;}
                        case 2: {numberName = "two";break;}
                        case 3: {numberName = "three";break;}
                        case 4: {numberName = "four";break;}
                        case 5: {numberName = "five";break;}
                        case 6: {numberName = "six";break;}
                        case 7: {numberName = "seven";break;}
                        case 8: {numberName = "eight";break;}
                        case 9: {numberName = "nine";break;}
                        case 10: {numberName = "ten";break;}
                    }
                    textArray[firstIndex][secondIndex][thirdIndex] = numberName;
                }
            }
        }
        System.out.println("Представление строковым массивом");
        System.out.println(Arrays.deepToString(textArray));
    }
}