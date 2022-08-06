package lesson2;

public class Task7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 0 || i == 5) {
                for (int a = 0; a <= 8; a++) {
                    System.out.print('*');
                }
            } else {
                for (int a = 0; a <= 8; a++) {
                    if (a == 0 || a == 8) {
                        System.out.print('*');
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}

