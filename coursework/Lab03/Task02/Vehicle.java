package Task02;

public abstract class Vehicle {

    // protected attributes
    protected String brand;
    protected String model;
    protected int year;

    // constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
    }

    public abstract double calculateMaintenanceCost();
}
