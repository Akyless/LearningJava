package com.Sprint2;

import java.util.Scanner;

public class ExerciseS06 {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);
        String s = text.nextLine();
        System.out.println(s.replace("бяка", "\"####\""));
    }
}