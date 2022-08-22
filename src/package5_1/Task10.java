package package5_1;
//Create a new class. Make it impossible to create a new object of this class using a constructor.
//Provide an appropriate public method that will allow clients of your class create a new object.


public class Task10 {
    public static void main(String[] args) {
        B b = B.getB();
    }

}

class B {
    private B() {
        System.out.println("la");
    }

    static B getB() {
        return new B();
    }
}