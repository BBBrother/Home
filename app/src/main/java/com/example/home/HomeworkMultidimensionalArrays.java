package com.example.home;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMultidimensionalArrays {
    public static void main(String[] args){
        task1();
    }

    static void task1(){
        System.out.println("Задание 1");
        System.out.println("Введите размер двухмерного массива");
        Scanner in = new Scanner(System.in);
        int arrayLine = in.nextInt();
        int arrayColumn = in.nextInt();
        int[][] twoDimensionalArray = new int[arrayLine][arrayColumn];
        for (int[] innerArray : twoDimensionalArray){
            for (int index = 0; index < innerArray.length;index++) {
                innerArray[index] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Ваш массив выглядит так");
        System.out.println(Arrays.deepToString(twoDimensionalArray));

        int[] oneDimensionalArray = new int[arrayLine*arrayColumn];
        int indexNew = 0;
        for (int[]innerArray: twoDimensionalArray){
            for (int index = 0; index<innerArray.length; index++){
                oneDimensionalArray[indexNew] = innerArray[index];
                indexNew++;
            }
        }
        System.out.println("Преобразованный массив");
        System.out.println(Arrays.toString(oneDimensionalArray));
    }
}
