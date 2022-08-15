package lesson4;
//Write your own example of the recursive function. You can find a lot of examples on the Internet.

public class Task9 {
    public static void main(String[] args) {
        //call recursion
        sum(3);
    }

    public static void sum(int k) {
        System.out.println("some prints: " + k);
        if(k > 0) {
            k = k - 1;
            sum(k);
        }
    }
}
