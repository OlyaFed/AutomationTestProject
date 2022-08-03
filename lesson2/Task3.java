package com.github.olya.fedyak.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayInts = new int[10];
        Random rn = new Random();
        for (int a = 0; a< arrayInts.length; a++)
        {
            arrayInts[a]=   rn.nextInt(10) + 1;
        }
        for (int b = 0; b< arrayInts.length; b++)
        {
            System.out.println(arrayInts[b]);
        }

    }
}
