package lesson4_1;

public class Fields {
    double firstField;
    double secondField;
     String countN;

    public Fields(double firstField, double secondField, String countN) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.countN = countN;
    }
    public Fields() {}
    public String countSquare () {
        if (firstField + secondField > 2) {
            return this.firstField + this.secondField + "";
        }
        return this.countN +"wrong data" ;
    }

}
