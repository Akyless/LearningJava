package com.Sprint2;

public class Exercise29While {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 9) {
            int b = 1;
            while (b <= 9) {
                System.out.println(a + "*" + b + "=" + (a * b));
                b++;
            }
            System.out.println();
            a++;
        }
    }
}