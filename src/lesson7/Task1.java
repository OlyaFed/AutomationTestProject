package lesson7;
//Create a new interface "Flyable". This interface should have one method "void fly()".
// Create two new classes "Bird" and
//"Duck" which implement "Flyable" interface. Provide your implementation for the "fly" method.


public class Task1 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Bird bird = new Bird();
        duck.fly();
        bird.fly();
    }

}
interface Flyable {
    void fly();
}


