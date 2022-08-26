package lesson6.task5;

public class Cicle extends Figure {
    Cicle(int width, int height) {
        super(width, height);
    }

    @Override
    int calculateArea() {
        return (int) 3.14 *this.height/2* this.height/2;
    }
}
