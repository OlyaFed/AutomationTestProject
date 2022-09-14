package lesson4_1;
//Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

public class Overloading{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class ClassOverloading1{
    public static void main(String[] args){
        System.out.println(Overloading.add(1,11));
        System.out.println(Overloading.add(4,6,18));
    }}