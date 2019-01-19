package com.Sprint2;

import java.util.Scanner;

public class ExerciseS12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three digit number abc: ");
        int abc = scanner.nextInt();

        if (Math.abs(abc) >= 100 & Math.abs(abc) <= 999) {
            int a = abc % 10;
            abc /= 10;
            int b = abc % 10;
            abc /= 10;
            int c = abc % 10;
            if ((a != b) & (a != c) & (c != b)) {
                System.out.println("В числе НЕТ одинаковых цифр !");
            } else {
                System.out.println("В числе ЕСТЬ одинаковые цифры !");
            }
        } else {
            System.out.println("Это число не трехзначное!!");
        }
    }
}