package com.Sprint2;

import java.util.Random;
import java.util.Scanner;

public class ExerciseS07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt(100);
        boolean isGameRunning = true;
        int b = 0;
        do {
            if (b <= 2) {
                System.out.println("Enter c: ");
                int c = scanner.nextInt();
                if (a < c) {
                    System.out.println("Много!");
                    b += 1;
                } else if (a > c) {
                    System.out.println("Мало!");
                    b += 1;
                } else {
                    System.out.println("Молодец!");
                    isGameRunning = false;
                }
            } else {
                System.out.println(" Вы проиграли!!");
                isGameRunning = false;
            }

        } while (isGameRunning);
    }
}
