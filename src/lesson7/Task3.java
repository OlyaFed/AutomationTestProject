package lesson7;
//Create two interfaces Volume and State:
//interface Volume {
//    void changeVolume(double value);
//}
//
//interface State {
//   void on();
//   void off();
//}
//
//Create a new class "MyDevice" which implements both interfaces. Provide your implementations of methods.



public class Task3 {
    public static void main(String[] args) {
        MyDevice myDevice = new MyDevice();
        myDevice.on();
        myDevice.changeVolume(90.0);
        myDevice.off();

    }
}
