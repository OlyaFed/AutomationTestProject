package lesson7;

//Create a new interface "Converter". This interface should have one method "convert(double celsius)".
// Provide several implementations of the "Converter" interface like "KelvinConverter" and "FahrenheitConverter"
// which convert celsius degrees to kelvins or fahrenheits accordingly.

public class Task2 {
    public static void main(String[] args) {
        double celsius = 9;
      Converter kelvinConverter = new KelvinConverter();
      Converter fahrenheitConverter = new FahrenheitConverter();
        System.out.println("celsius "+ celsius);
        System.out.println("kelvin is " + kelvinConverter.convert(celsius));
        System.out.println("fahrenheit is " + fahrenheitConverter.convert(celsius));
    }
}
