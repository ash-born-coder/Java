package javaCourse.OOP;

public class objectOrientedProgramming {
    public static void main(String[] args){

        // Object = An entity that holds data (attributes).
        //          and can perform actions (methods)
        //          It is a reference data type

        //System.out.println(car); since objects are reference data type if you were to print the car directly you would get a memory address
        //A dot(.) is know as the dot operator and it allows to access things inside the object

        Car car = new Car();
        Car car2 = new Car();

        //car.isRunning = true;  //here we also can change the attributes

/*        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);                                */

        //System.out.println(car.isRunning);
        //car.start();
        //System.out.println(car.isRunning);
        //car.stop();
        //System.out.println(car.isRunning);

        //car.drive();
        //car.brake();

        System.out.println(car.make + " " + car.model);
        System.out.println(car.make + " " + car.model);


    }
}
