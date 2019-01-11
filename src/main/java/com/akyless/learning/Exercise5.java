package com.akyless.learning;

import java.util.Scanner;
public class Exercise5 {
    public static void main (String[] args) {
        System.out.println("Please input a:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input b:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("a/b = " + (a / b));
        double c = a;
        double d = b;
        System.out.println("c = " +c);
        System.out.println("d = " +d);

        if (c/d>0) {
            System.out.println("Число c нацело делится на число d");
        } else if ((double)c/d>0) {
            System.out.println("Число c не делится на число d");
        }
        if ((double)c/d>0) {
            System.out.println("Частное от деления чисел");
        }
        System.out.println("c/d = " + ((double)c / d));
    }
}