package lesson4;

public class Car extends Transport{
    Wheels big = new Wheels();
  int getNumberOfWheels() {
      return this.big.wheelsnumber;

   }
}
