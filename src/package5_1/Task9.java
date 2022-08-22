package package5_1;
//Answer the question: What is a private access? Create a simple program to demonstrate the private access.
//Tips:
// - Create two classes
// - In on of them create private members
// - In the second class create an object of the first class
// - Try to access the private members

public class Task9 {
    public static void main(String[] args) {
       Task92 n = new Task92();
   //    n.j
//        n.printLala
    }
}
class Task92 {
   private String j = "kkuku";
  private void printLala(){
       System.out.println("lala");
   }
}