package lesson4;
//Create a simple class with a bunch of constructors.
//All these constructors should take different number of parameters.
//Demonstrate in your class, how we can call one constructor from another.


public class Task5 {
    public static void main(String[] args) {
        Test one = new Test();
        Test two = new Test(9, "hny", 8.0);
        Test three = new Test(9, "hjo");
        Test four = new Test(8.9, 'R');

    }
}
class Test{
    Test (){}
    Test (int a, String b, double c){}
    Test (int a, String b){}
    Test (double c, char t){}
}