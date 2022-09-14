package lesson6.task5;
//Create an abstract class Figure. Add fields width and height to it. Add an abstract method "calculateArea"
// which should be overridden by the concrete figures to calculate its area.
//Figures: Rectangle, Triangle, Circle



public class Task5 {
    public static void main(String[] args) {
        Cicle a = new Cicle(11, 11);
        Triangle big = new Triangle(8,18);
        Rectangular rec = new Rectangular(11, 9);
        System.out.println("cicle is " + a.calculateArea());
        System.out.println("triangle is " + big.calculateArea());
        System.out.println("rectangular is "+ rec.calculateArea());
    }
}
