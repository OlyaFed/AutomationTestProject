package com.github.olya.fedyak.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        Random rn = new Random();
        int sum = 0;
        for (int a = 0; a < arrayOne.length; a++) {
            arrayOne[a] = rn.nextInt(10) + 1;
        }
        for (int a = 0; a < arrayOne.length; a++) {
            if (a != 0 && a != 9) {
                sum = sum + arrayOne[a];
            }
        }

        System.out.println(sum);
    }
}

