package lesson6.task4;

public class B extends A {
    B(String name, int number) {
        super(name, number);
    }
@Override
void method2() {
    System.out.println("method 2 from the class B");
    System.out.println("method 2 from the class B");
    System.out.println("method 2 from the class B");
}
@Override
String method() {
    return this.p +" " +"some functionality from class B ";
}



}
