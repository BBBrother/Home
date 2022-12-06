package com.example.home.homework_10;

import java.util.Scanner;


public class Homework {
    private static final String PATTERN_DOCUMENT_NAME = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";

    public static void main(String[] args) {
        documentData();
    }

    public static void documentData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер документа в формате: 1111-aaa-1111-aaa-1a1a");
        String documentName = in.nextLine();
        while (true) {
            if (documentName.matches(PATTERN_DOCUMENT_NAME)) {
                break;
            } else {
                System.out.println("Ошибка ввода");
                System.out.println("Введите номер документа в формате: 1111-aaa-1111-aaa-1a1a");
                documentName = in.nextLine();
            }
        }
        System.out.println("Номер вашего документа: " + documentName);

        PlayingWithDocumentName.outputFirstTwoNumberBlock(documentName);
        PlayingWithDocumentName.outputDocumentNumberWithoutLetters(documentName);
        PlayingWithDocumentName.outputDocumentLetters(documentName);
        PlayingWithDocumentName.checkingFogMatchingABC(documentName);
        PlayingWithDocumentName.checkingToEnding1a2b(documentName);

    }


}
