package package5_1;
//Create a new class. Add 5 private fields. Add getter and setters to all the fields.


public class Task12 {
    public static void main(String[] args) {
        Kittens j= new Kittens();
        System.out.println(j.getCat());
        j.setCat("Vesta");
        System.out.println(j.getCat());

        System.out.println(j.getAboutCat());
        j.setAboutCat("It is a grey cat");
        System.out.println(j.getAboutCat());

        System.out.println(j.getEyes());
        j.setEyes(3);
        System.out.println(j.getEyes());

        System.out.println(j.getPaws());
        j.setPaws(3);
        System.out.println(j.getPaws());

        System.out.println(j.getDescription());
        j.setDescription("This is a tragic cat");
        System.out.println(j.getDescription());



    }
}
class Kittens {
    private String cat = "Cat";
    private int eyes = 2;
    private int paws =4;
    private String description = "sad, red";
    private String aboutCat ="About this animal";

    void setCat (String a){
        this.cat = a;
    }
    void setPaws (int c){this.paws =c;
    }
    void setDescription (String d){this.description =d;
    }
    void setAboutCat (String f){this.aboutCat =f;
    }
    void setEyes (int b){this.eyes =b;
    }


    String getCat(){
        return this.cat;
    }
    int getEyes (){
        return this.eyes;
    }
    int getPaws(){
        return this.paws;
    }
    String getDescription(){
        return this.description;
    }
    String getAboutCat(){
        return this.aboutCat;
    }

}