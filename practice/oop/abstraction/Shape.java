package javaCourse.abstraction;

public abstract class Shape {

    abstract double area(); // Abstract method

    void display(){  // Concrete method
        System.out.println("This is a Shape");
    }
    /* *** IN an abstract class a concrete method is inherited *** */
}
