package lesson6;
    public class Test{
        public static void main(String[] args) {
            Vehicle[] vehicleArray = {
                    new Car(),
                    new Track(),
                    new Tractor()
            };

            for (Vehicle item : vehicleArray) {
                item.steer(10);
                item.move(5, 5);
                item.stop();
                System.out.println();
            }
        }
    }

