package lesson5;
//Take the classes from the task 1. Create a new test class.
//Import everything (*) from your created packages.
//Now try to create objects of your classes without specifying the packages in front of the class names.
// What happened? How can we avoid this?


import lesson5.com.domainname.*;
//import lesson5.com1.*;

public class Task6 {
    public static void main(String[] args) {

        lesson5.com1.Modulename fromLesson5 = new lesson5.com1.Modulename();
        Modulename fromTestcomDomain = new Modulename();
    }
}


