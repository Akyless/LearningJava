package com.Sprint2;

import java.util.Arrays;
import java.util.Random;

public class ExerciseS38 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int ch = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100) - 50;
            if (array[i] > 0) {
                if (array[i] % 2 == 0) {
                    ch += array[i];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма четных положительных элементов - " + ch);
    }
}
