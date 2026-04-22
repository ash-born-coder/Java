package javaCourse.abstraction;

public class Main {
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)


        // **** We can't directly create any shape objects but we can create certain types of shape ****
        //Shape shape = new Shape();  //Shape is abstract therefore it cannot be instantiated

        //but we can circles, triangle and rectangle tho

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        // in concrete method we dont need to implement or override the method in shape class in all other classes
        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
