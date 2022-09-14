package lesson4_1;

public class Family {
    String mother;
    String father;
    String daughter;
    String son;

    {mother = "Kate";
        father = "Bob";
        daughter = "Alice";
        son = "Tommi";
    }


    public Family (String inputMother, String inputFather, String inputDaughter, String inputSon){
        this.mother = inputMother;
        this.father = inputFather;
        this.daughter = inputDaughter;
        this.son = inputSon;

    }
    public Family(){}

    @Override public String toString () {return "the fist member of the family is " + this.father+ ".\n"+ "the second member of the family is "+this.mother+ ".\n" + "the third member of the family is "+this.son+ ".\n" + "the forth member of the family is " +this.daughter;}

   public void setData(String inputMother, String inputFather, String inputDaughter, String inputSon){
       this.mother = inputMother;
       this.father = inputFather;
       this.daughter = inputDaughter;
       this.son = inputSon;
    }

}
