package lesson6.task5;

public class Triangle extends Figure{
    Triangle (int height, int width ){
        super ( height, width);
        this.height= height;
        this.width = width;
    }
int calculateArea (){
        return (int) this.width*this.height/2;

    }
}
