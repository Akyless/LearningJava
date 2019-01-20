package com.Sprint2;

import java.util.Scanner;

public class ExerciseS17 {
    public static void main(String[] args) {
        System.out.println("Enter a six digit number: ");
        int sixdig = new Scanner(System.in).nextInt();

        if (Math.abs(sixdig) > 99999 & Math.abs(sixdig) <= 999999) {
            int num1 = sixdig % 10;
            sixdig /= 10;
            int num2 = sixdig % 10;
            sixdig /= 10;
            int num3 = sixdig % 10;
            sixdig /= 10;
            int number1 = (num1 + num2 + num3);
            System.out.println(number1);
            int nub1 = sixdig % 10;
            sixdig /= 10;
            int nub2 = sixdig % 10;
            sixdig /= 10;
            int nub3 = sixdig % 10;
            sixdig /= 10;
            int number2 = (nub1 + nub2 + nub3);
            System.out.println(number2);

            if (number1 == number2) {
                System.out.println("You have a lucky ticket!!");
            } else {
                System.out.println("Unfortunately! This is not a lucky ticket.");
            }
        } else {
            System.out.println("This is not six digit number!!");
        }
    }
}
