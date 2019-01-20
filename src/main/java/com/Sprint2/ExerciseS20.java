package com.Sprint2;

import java.math.BigInteger;
import java.util.Scanner;

public class ExerciseS20 {
    public static void main(String[] args) {

        System.out.print("Please, enter the index of fibonacci numbers: ");
        int index = new Scanner(System.in).nextInt();

        if (index <= 0)
            System.out.println("Please, enter the valid index. Index should be the positive number and greater than 0");
        else if (index <= 2)
            System.out.println(1);
        else {
            BigInteger a = BigInteger.ONE;
            BigInteger b = BigInteger.ONE;

            for (int i = 2; i < index; i++) {
                BigInteger next = a.add(b);
                a = b;
                b = next;
            }
            System.out.println(String.format("The value of fibonacci set on index %d is %d", index, b));
        }
    }
}