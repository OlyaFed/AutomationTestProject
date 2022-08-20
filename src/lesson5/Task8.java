package lesson5;
//Answer the question: What is a public access? Create a simple program to demonstrate the public access.
//You can use tips from the task 3.


public class Task8 {
    public static void main( String[] args ) {

       Cat cat = new Cat();

        cat.eyesCount = 2;

        cat.display();
    }
}
class Cat {
    public int eyesCount;
    public void display() {
        System.out.println("I am a cat.");
        System.out.println("I have " + eyesCount + " eyes.");
    }
}