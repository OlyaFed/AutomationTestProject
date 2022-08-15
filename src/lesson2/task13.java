package lesson2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class task13 {
    public static void main(String[] args) {
        int array[] = {4, 5, 0, -2, 5};
        int size = array.length;
Arrays.sort(array);


            System.out.println("sorted Array ::" + Arrays.toString(array));
            int res = array[size - 1];
            System.out.println("largest elements are : " + res);
        }

}









