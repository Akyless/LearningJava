package com.akyless.learning;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Please input a:");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Please input b:");
        int b = new Scanner(System.in).nextInt();
        if (b != 0) {
            System.out.println("a/b = " + (a / b));

            if (a % b == 0) {
                System.out.println("Число a нацело делится на число b");
            } else {
                System.out.println("Число a нацело неделится на число b");
                System.out.println("a/b= " + (a % b));
            }
        } else {
            System.out.println("На ноль делить нельзя!");
        }

    }
}