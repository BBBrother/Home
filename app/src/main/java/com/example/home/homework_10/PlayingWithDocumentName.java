package com.example.home.homework_10;

import java.util.Locale;

public class PlayingWithDocumentName {
    public static void outputFirstTwoNumberBlock(String numberBlock) {
        System.out.println("1.Первые два блока цифр: " + numberBlock.substring(0, 4) + " " + numberBlock.substring(9, 13));
    }

    public static void outputDocumentNumberWithoutLetters(String nameWithoutLetters) {
        System.out.println("2.Номер документа с заменёнными буквами: " + nameWithoutLetters.replaceAll("[A-z]", "*"));
    }

    public static void outputDocumentLetters(String inputName) {
        String upperName = inputName.toUpperCase(Locale.ROOT);
        StringBuilder onlyLetters = new StringBuilder();
        onlyLetters.append(upperName.substring(5, 8)).append("/").append(upperName.substring(14, 17)).append("/").append(upperName.charAt(19)).append("/").append(upperName.charAt(21));
        System.out.println("3.Только большие буквы: " + onlyLetters);
    }

    public static void checkingFogMatchingABC(String abcMatching) {
        if (abcMatching.toLowerCase(Locale.ROOT).regionMatches(5, "abc", 0, 3) || abcMatching.toLowerCase(Locale.ROOT).regionMatches(14, "abc", 0, 3)) {
            System.out.println("4.Номер документа содержит совпадение с \"abc\"");
        } else {
            System.out.println("4.Номер документа не содержит совпадений с \"abc\"");
        }
    }

    public static void checkingToEnding1a2b(String ending) {
        if (ending.endsWith("1a2b")) {
            System.out.println("5.Номер документа заканчивается на 1a2b");
        } else {
            System.out.println("5.Номер документа не заканчивается на 1a2b");
        }
    }
}
