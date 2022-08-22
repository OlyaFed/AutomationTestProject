package lesson4_1;

public class Car extends Transport {
    Wheels big = new Wheels();
  int getNumberOfWheels() {
      return this.big.wheelsnumber;

   }
}
