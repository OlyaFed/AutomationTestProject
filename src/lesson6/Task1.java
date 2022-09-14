package lesson6;

//Write a simple java program to demonstrate composition of classes.
//Tips:
// a) Create several classes A, B, C;
// b) Add functionality of classes B and C to the class A without using inheritance.
// c) Create a test class and demonstrate how we can use functionality of classes B and C via created object of the class A;


public class Task1 {
    public static void main(String[] args) {
      A a = new A();
        System.out.println("this role: "+ a.getRole() +"\n" +"salary given "+ a.getSalary());
    }
}


