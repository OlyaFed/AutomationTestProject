package lesson8;

//1. Create method to check: if number < 0 print “Number < 0”,
// if number > 0 print “Number > 0” if number = 0 throw your own exception.
//        Arithmetic ex, Exception ex;
//
//        void method(int number) {
//        if (number < 0) ...
//        else if (number == 0) ...
//        }
public class Task1 {
    public static void main(String[] args) {
        Task1 t = new Task1();
        t.method(-1);
        t.method(1);
        t.method(0);
    }

    void method(int number) {
        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        } else if (number == 0) {
            throw new CustomException("0 is impossible");
        }
    }
}

class CustomException extends ArithmeticException{

    public CustomException(String s) {
        super(s);
    }
}
