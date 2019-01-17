package com.Sprint2;

import java.util.Scanner;

public class ExerciseS28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a");
        int a = scanner.nextInt();
        int max = 0;
        if (a != 0) {
            while (a > 0) {
                if (a % 10 > max) max = (int) (a % 10);
                a /= 10;
            }
            System.out.println("Наибольшей цифрой является  " + max);
        } else {
            System.out.println("Заданное число не является натуральным!");
            System.out.println(" Try once more!!");
        }
    }
}