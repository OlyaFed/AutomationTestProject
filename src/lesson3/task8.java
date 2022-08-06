// Given credit card's number 1234 5678 9012 3456. Print card's number in the next view **** **** **** 3456.


public class task8 {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 1234 4567";
        System.out.println("**** **** **** " + cardNumber.substring(15));
    }

}
