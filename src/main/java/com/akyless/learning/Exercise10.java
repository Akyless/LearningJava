package com.akyless.learning;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a");
        int a = scanner.nextInt();
        char b = (char) a;
        System.out.println(b);

        if (a > 64 & a < 91) {
            System.out.println("char a = " + a);
        } else if (a > 96 & a < 123) {
            System.out.println("char a = " + a);
        } else {
            System.out.println("Это не буква Англиского алфавита!");
        }
    }
}
