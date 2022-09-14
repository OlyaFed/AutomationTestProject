package lesson4_1;
//Create a simple class with any 3 fields.
//Demonstrate in your class how we can use "this" keyword to refer to the object,
//from which a constructor or a method was invoked.

public class Task6 {

    public static void main(String[] args) {
        Fields fields = new Fields(25.0, 59.0, "+");
        System.out.println("the total number of fields' square is "+fields.countSquare());

    }

    }

