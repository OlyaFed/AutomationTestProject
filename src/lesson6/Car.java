package lesson6;

class Car extends Vehicle{
    private int currentDirection = 35;
    private int currentVelocity = 98;

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Car.steer(): Steering at " + currentDirection + "degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Car.move(): Moving at " + currentVelocity + "in direction " + currentDirection);

    }
    public void stop(){
        this.currentVelocity = 0;

    }
}