package javaCourse.abstraction;

public class Rectangle extends Shape{
    double length ;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override  // now the error message is gone since we inherit from the shape class and we have an abstract method
    double area(){
        return length * width;
    }
}
