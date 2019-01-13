package com.akyless.learning;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input operator: {C;R;T}");
        String line = scanner.nextLine();

        if (line.length() == 1) {
            char symbol = line.charAt(0);
            if (symbol == 'C') {
                System.out.println("Enter r");
                int r = scanner.nextInt();
                if (r >= 0) {
                    System.out.println("S = " + (3.14 * r * r));
                } else {
                    System.out.println("r не может быть меньше нуля! ");
                }
            } else if (symbol == 'R') {
                System.out.println("Enter length");
                int length = scanner.nextInt();
                System.out.println("Enter width");
                int width = scanner.nextInt();
                if (length >= 0 && width >= 0) {
                    System.out.println("S = " + (length * width));
                } else {
                    System.out.println("Length and width не может быть меньше нуля!");
                }
            } else if (symbol == 'T') {
                System.out.println("Enter z");
                int z = scanner.nextInt();
                System.out.println("Enter x ");
                int x = scanner.nextInt();
                System.out.println("Enter c");
                int c = scanner.nextInt();
                int p = (z + x + c) / 2;
                if (z > 0 & x > 0 & c > 0) {
                    System.out.println("p = " + p);
                    System.out.println("S = " + (Math.sqrt(p * (p - z) * (p - x) * (p - c))));
                } else {
                    System.out.println("Неправильный аргумент!");
                }
            } else {
                System.out.println("Неправильный аргумент! ");
            }
        }
    }
}
