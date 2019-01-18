package com.Sprint2;

import java.util.Scanner;

public class ExerciseS48IFelse {
    public static void main(String[] args) {

        System.out.println("Enter number from 1 to 12");
        int a = new Scanner(System.in).nextInt();
        if (a == 1) {
            System.out.println("Это месяц - январь");
        } else if (a == 2) {
            System.out.println("Это месяц - февраль");
        } else if (a == 3) {
            System.out.println("Это месяц - март");
        } else if (a == 4) {
            System.out.println("Это месяц - апрель");
        } else if (a == 5) {
            System.out.println("Это месяц - май");
        } else if (a == 6) {
            System.out.println("Это месяц - июнь");
        } else if (a == 7) {
            System.out.println("Это месяц - июль");
        } else if (a == 8) {
            System.out.println("Это месяц - август");
        } else if (a == 9) {
            System.out.println("Это месяц - сентябрь");
        } else if (a == 10) {
            System.out.println("Это месяц - октябрь");
        } else if (a == 11) {
            System.out.println("Это месяц - ноябрь");
        } else if (a == 12) {
            System.out.println("Это месяц - декабрь");
        } else {
            System.out.println("Такого месяца не существует!!");
        }
    }
}