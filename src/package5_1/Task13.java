package package5_1;
//What is the difference between static and non-static field of a class?
//Create an example to demonstrate this concept.



public class Task13 {
    static String n = "Static String n";
    String m = "Non Static m";


    public static void main(String[] args) {
        System.out.println(Task13.n);
      Task13 t = new Task13();

        System.out.println(t.m);


    }
}
