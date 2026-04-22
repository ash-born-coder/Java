package javaCourse.arrayOfObjects;

public class Main {
    public static void main(String[] args){

        //Car car1 = new Car("Testarossa","White");
        //Car car2 = new Car("Ultima", "Pink");
        //Car car3 = new Car("Carrera","Yellow");

        // for an array you have to list the data type of what you are storing
        // here we are going to store car objects so the data type of Car objects 'Car'

        //Car[] cars = {car1, car2, car3};

        Car[] cars = {new Car("Testarossa","White"),
                      new Car("Ultima", "Pink"),
                      new Car("Carrera","Yellow")};

        // this is the same as above but here we construct new objects without giving each object a unique identifier, there are known as anonymous objects

        System.out.println(cars.length);

        for (int i = 0; i < cars.length; i++){
           cars[i].color = "Black";
        }

        for (int i = 0; i < cars.length; i++){
            cars[i].drive();
        }


    }
}
