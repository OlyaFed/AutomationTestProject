package lesson5;
//Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
//Create a third class with the main method.
//In the main method create two different objects of your classes specifying the full name of the classes (including packages).

public class Task5 {
    public static void main(String[] args) {

        lesson5.com1.Modulename fromLesson5 = new lesson5.com1.Modulename();
        lesson5.com.domainname.Modulename fromTestcomDomain = new lesson5.com.domainname.Modulename();
    }
}
