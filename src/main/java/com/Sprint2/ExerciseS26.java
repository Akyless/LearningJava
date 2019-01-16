package com.Sprint2;

import java.util.Scanner;

public class ExerciseS26 {

    public static void main(String[] args) {

        int a = new Scanner(System.in).nextInt();
        int b = 0;
        for (int i = 0; i < a; i++) {
            b += (i + 1);
        }
        System.out.println(b);
        b = 1;
        for (int j = 0; j < a; j++) {
           b *= (j + 1);
        }
        System.out.println(b);
    }
}