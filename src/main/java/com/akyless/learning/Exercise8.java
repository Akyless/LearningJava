package com.akyless.learning;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Please input a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Please input c: ");
        int c = new Scanner(System.in).nextInt();
        int D = (b * b - 4 * a * c);
        System.out.println("D =" + D);

        if (D > 0) {
            System.out.println("x1 = " + ((-b + (Math.sqrt(D))) / 2 * a));
            System.out.println("x2 = " + ((-b - (Math.sqrt(D))) / 2 * a));
        } else if (D == 0) {
            System.out.println("x = " + (-b / 2 * a));
        } else {
            System.out.println("Уравнение корней не имеет!");
        }
    }
}
