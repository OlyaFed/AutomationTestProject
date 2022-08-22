package lesson4_1;
//3. Create 3 different classes to demonstrate the relationships "has-a" and "uses-a". They can be anything you want.
//For example: Car - Engine - Wheels

public class task3 {
    public static void main(String[] args) {
       Car a  = new Car();

        System.out.println("Car A is Transport: " +a.isTransport());
        System.out.println("The number of wheels: "+ a.getNumberOfWheels());
    }
}



