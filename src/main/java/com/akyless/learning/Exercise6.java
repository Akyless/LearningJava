package com.akyless.learning;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Please input a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Please input operator: {B;K}");
        String zt = new Scanner(System.in).nextLine();

        if (zt.length() == 1) {
            if (zt.charAt(0) == 'B') {
                System.out.println("B = " + (a * 1024));
            } else if (zt.charAt(0) == 'K') {
                System.out.println("K = " + (a / 1024));
            } else {
                System.out.println("Unsupported operator: " + zt);
            }

        } else {
            System.out.println("Enter one symbol ");
        }
    }
}