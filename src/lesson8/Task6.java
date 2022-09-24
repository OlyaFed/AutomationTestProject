package lesson8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//6. Write a program that will read numbers from the keyboard.
//        The code for reading numbers from the keyboard must be in the readData method.
//        The code inside the readData is wrapped in a try..catch.
//        If the user entered some text, instead of a number, this method should catch the exception and display all
//        previously entered numbers as a result. Each number should be printed from a new line preserving the order of the input.
//
public class Task6 {
    public static void main(String[] args) {
        readData(args);
    }

    private static void readData(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        try {
            while (true) {
                Scanner sc =new Scanner(System.in);
                System.out.print("enter number ");
                int number = sc.nextInt();
                result.add(number);
            }
        } catch (InputMismatchException e) {
            for (Integer element : result) {
                System.out.println("from catch block " + element);
            }
            System.out.println(e);
        }
    }
}
