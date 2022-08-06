package lesson2;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int z = 0; z <= 9 ; z++) {
                if (z < 5 + i && z > 5 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
