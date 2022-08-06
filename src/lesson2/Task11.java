package lesson2;

public class Task11 {
    public static void main(String[] args) {
        //        Print all the numbers from 1 to 100 that are divisible by 3 or divisible by 5, but not divisible by 2.
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && (i % 3 == 0 || i % 5 == 0)) {
                System.out.print(" " + i);
            }
        }
    }
}
