package lesson6.task5;

public class Rectangular extends Figure{
    @Override
    int calculateArea() {
        return this.height*this.width;
    }

    Rectangular (int height, int width){
        super(height, width);
        this.height = height;
        this.width = width;
    }
}
