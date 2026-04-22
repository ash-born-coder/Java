package javaCourse.abstraction;

public class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override  // now the error message is gone since we inherit from the shape class and we have an abstract method
    double area(){
        return 0.5 * base * height;
    }
}
