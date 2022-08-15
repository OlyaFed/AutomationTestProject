package lesson5;
//Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
//Create a third class with the main method.
//In the main method create two different objects of your classes specifying the full name of the classes (including packages).

import Tests.com.domainname.Modulename;
import com.sun.org.apache.xpath.internal.operations.Mod;

public class Task5 {
    public static void main(String[] args) {
        class Modulename{}
        Modulename fromLesson5 = new Modulename();
        Modulename fromTestcomDomain = new Modulename();
    }
}
