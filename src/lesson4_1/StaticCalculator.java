package lesson4_1;

public class StaticCalculator {
    double firstValue;
    double secondValue;
    String operation="+++++";


    public StaticCalculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public StaticCalculator() {}


    public String calculate() {
        if (this.operation.equals("+")) {
            return this.firstValue + this.secondValue + "";
        }
        return this.operation +"This operation is not supported" ;
    }
}


