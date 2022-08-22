package lesson4_1;

public class Human {
    double weight;
    int age;
    String firstName;
    String lastName;
    double height;

    public Human ( String inputFirstName, String inputLastName, double inputWeight,int inputAge, double inputHeight){
        this.weight=inputWeight;
        this.age = inputAge;
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.height = inputHeight;
    }

    @Override
    public String toString() {return "The name is " + this.firstName + "." + "The last name is "+ this.lastName+ "." + "" + "The age is " + this.age+ ".\n"+ "The height is " + this.height+" "+"," +"the weight is " + this.weight;}
}
