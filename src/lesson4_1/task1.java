//1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
//Requirements:
//a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
//b) Add to the class a constructor with parameters which initialize all the fields.
package lesson4_1;

public class task1 {
    public static void main(String[] args) {
        Human i = new Human("Alex", "Black", 75.0,  18, 189.0 );

        System.out.println("Data about this human: "+ i+" ");

    }
}
