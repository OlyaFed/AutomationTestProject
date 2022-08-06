package lesson2;

public class Task5 {
    public static void main(String[] args) {
       // int i,fact = 1;
       // int number = 8;
       // for (i=1; i <= number; i++) {
           // fact = fact * i;

        //}
       // System.out.println("Factorial of " + number + " is: " + fact);
    //}
    int number = 8;
    long fact = 1;
    int i = 1;
        while(i<=number)
    {
        fact = fact * i;
        i++;
    }
        System.out.println("Factorial of "+number+" is: "+fact);
}
}


