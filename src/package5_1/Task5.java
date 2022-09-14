package package5_1;
//Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
//Create a third class with the main method.
//In the main method create two different objects of your classes specifying the full name of the classes (including packages).

import package5_1.com1.Modulename;

public class Task5 {
    public static void main(String[] args) {

        Modulename fromLesson5 = new Modulename();
        package5_1.domainname.Modulename fromTestcomDomain = new package5_1.domainname.Modulename();
    }
}
