package com.Sprint2;

import java.util.Scanner;

public class ExerciseS48switch {
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 12");
        int month = new Scanner(System.in).nextInt();
        switch (month) {
            case 1:
                System.out.println("Январь!");
                break;
            case 2:
                System.out.println("Февраль!");
                break;
            case 3:
                System.out.println("Март!");
                break;
            case 4:
                System.out.println("Апрель!");
                break;
            case 5:
                System.out.println("Май!");
                break;
            case 6:
                System.out.println("Июнь!");
                break;
            case 7:
                System.out.println("Июль!");
                break;
            case 8:
                System.out.println("Август!");
                break;
            case 9:
                System.out.println("Сентябрь!");
                break;
            case 10:
                System.out.println("Октябрь!");
                break;
            case 11:
                System.out.println("Ноябрь!");
                break;
            case 12:
                System.out.println("Декабрь!");
                break;
            default:
                System.out.println("Такого месяца не существует!!");
                break;
        }
    }
}