package com.akyless.learning;

// Даны две числовые переменные, задача — написать программу, меняющую местами эти переменные
public class Exercise1 {
    public static void main(String[] args) {
        int a = 17;
        int b = 32;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("#################");

        // code
        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

