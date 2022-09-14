package lesson4_1;
//Create a simple class with some fields.
//Demonstrate in your class how we can use initialization blocks.

public class Task7 {
    public static void main(String[] args) {

Family o = new Family();
        System.out.println("init.block in class "+ o);
        System.out.println();
        Family m = new Family("Anna", "Fred", "Syntia", "Alex");
        System.out.println("init.via constructor: "+ m);
        System.out.println();
        Family n = new Family();
        n.setData("Irene", "Bill","Anni ","Gorge");
        System.out.println("using the method: "+ n);


    }

}
