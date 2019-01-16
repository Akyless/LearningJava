package com.Sprint2;

import java.util.Scanner;

public class ExerciseS09 {

    public static void main(String[] args) {
        System.out.println("Please input a");
        String text = new Scanner(System.in).nextLine();

        for (int s = text.length() - 1; s >= 0; s--) {
            System.out.print(text.charAt(s));
        }
    }
}