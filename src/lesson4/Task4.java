package lesson4;
//Create a class StaticCalculator. It should have three fields: double firstValue, double secondValue and String operation.
//Create all required constructors to properly initialize your object.
//Consider the case when user does not provide any parameters when creates a new object.
//Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
//Write the test class which contains the main method.
//In this main method you should create your StaticCalculator object and do some calculation to test your code,
//by calling your "calculate" method.
//Print all results to the console.

public class Task4 {
    public static void main(String[] args) {
        StaticCalculator staticCalculator= new StaticCalculator(4.0, 49.0, "+");
        StaticCalculator staticCalculator2= new StaticCalculator ();

        System.out.println("the operation of "+" firstValue and secondValue is "+ staticCalculator.calculate());
        System.out.println(staticCalculator2.calculate());
    }
}
