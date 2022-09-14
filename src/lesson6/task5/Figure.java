package lesson6.task5;

public abstract class Figure {
    int width;
    int height;
   abstract int calculateArea ();
    Figure (int width, int height){
        this.height = height;
        this.width = width;
    };
}

