package lesson6;

//Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving(speed in other words).
// You will want to decide where to put the appropriate state and behaviours(fields and methods).
//As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.



public class Task3 {

    public static void main(String[] args) {
        Carsoul soul = new Carsoul("Soul", "4m");
        Carsoul carsoul = new Carsoul("soul", "crossover");
        System.out.println(carsoul.getCurrentVelocity());
        System.out.println(carsoul.getName());
        System.out.println(carsoul.getSize());
        System.out.println(carsoul.getCurrentDirection());
        carsoul.move(15, 150);
        carsoul.steer(176);
        carsoul.stop();
        System.out.println("this car "+ soul.getName());

    }
}
