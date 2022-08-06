package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        Random rn = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10) + 1;
        }

        int[] array2 = Arrays.copyOf(array, 10);
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < array2.length; i++) {
                if ((array2[i - 1] > array2[i])) {
                        int temp = array2[i - 1];
                        array2[i - 1] = array2[i];
                        array2[ i] =temp;
                    swapped = true;

                }
            }
        } while (swapped);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
