package lesson8;

//        2. Fix the method with try-catch to get the correct result of division:
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println(divideByZero());
//    }
//
//    public static int divideByZero() {
//        int a = 5;
//        int b = 0;
//        return a / b;
//    }
//}
public class Task2 {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }

        public static int divideByZero() {
            int a = 5;
            int b = 0;
            return a / b;
        }
    }
