package com.akyless.learning;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Please input x: ");
        int x = new Scanner(System.in).nextInt();

        if (x>0) {
            System.out.println("y = " + (2*x - 10));
        } else if (x == 0) {
            System.out.println("y = 0");
        } else if (x<0) {
            System.out.println("y = " + (2*(Math.abs(x)) - 1));
        }

    }
}
