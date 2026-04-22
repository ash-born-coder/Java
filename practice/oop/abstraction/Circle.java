package javaCourse.abstraction;

public class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override  // now the error message is gone since we inherit from the shape class and we have an abstract method
    double area(){
        return Math.PI * radius * radius;
    }
}
