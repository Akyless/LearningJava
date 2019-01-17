package com.Sprint2;

import java.util.Scanner;

public class ExerciseS39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        int bigletters = 0;
        int smallletters = 0;
        int others = 0;

        for (int a = 0; a < text.length(); a++) {
            char s = text.charAt(a);
            if (s > 64 & s < 91) {
                bigletters += 1;
            } else if (s > 96 & s < 123) {
                smallletters += 1;
            } else {
                others += 1;
            }
        }
        System.out.println("Количество заглавных букв в тексте " + bigletters);
        System.out.println("Количество строчных букв в тексте " + smallletters);
        System.out.println("Количество не букв в тексте " + others);
    }
}
