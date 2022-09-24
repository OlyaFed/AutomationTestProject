package lesson8;

//3. Finish the program to handle all the possible exceptions:
//public class Main {
//
//    public static void main(String[] args) {
//        int a = args.length;
//        System.out.println(a);
//
//        int b = 10 / a;
//        int[] c = {1};
//        System.out.println(c[1]);
//
//    }
//
//}
public class Task3 {
    public static void main(String[] args) {
        int a = args.length;
            try {
                int b = 10 / a; //ArithmeticException
                int[] c = {1};
                int a1 = c[1]; //ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

    }
}
