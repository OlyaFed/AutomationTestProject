package lesson6;
class Track extends Vehicle{
    private int currentDirection = 0;
    private int currentVelocity = 40;

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Track.steer(): Steering at " + currentDirection + "degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Track.move(): Moving at " + currentVelocity + "in direction " + currentDirection);

    }
    public void stop(){
        this.currentVelocity = 0;

    }
}