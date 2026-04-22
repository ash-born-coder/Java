package javaCourse.getterAndSetter;

public class Main {
    public static void main(String[] args) {

        // They help protect object data and add rule for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITABLE

        Car car = new Car("Charge", "Yellow", 28000);

        //car.model = "Corvette";  // the problem is that the attributes can be changed, because there can be a situation where we dont want the attribute to change
        // after using 'private' this becomes impossible
        // and also after using the private keyword the below statement also becomes unusable

        //System.out.println(car.color + " " + car.model + " " + car.price);

        // But to over come this we can use the 'GETTER' method as shown below

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        //car.color = "Blue";  even if we established the setter methods this way is not possible
        //car.price = 5000;

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());


    }
}
