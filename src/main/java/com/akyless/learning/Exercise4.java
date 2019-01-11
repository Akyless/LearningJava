package com.akyless.learning;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        System.out.println("Please input weight on the ground G:");
        int G = new Scanner(System.in).nextInt();
        System.out.println("G=" +G);
        System.out.println("Weight on the moon M:");
        System.out.println("M=" + ((double)(G*17)/100) );

    }
}
