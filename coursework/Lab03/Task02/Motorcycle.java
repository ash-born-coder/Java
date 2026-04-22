package Task02;

public class Motorcycle extends Vehicle {

    private int wheels;

    public Motorcycle(String brand, String model, int year, int wheels) {
        super(brand, model, year);
        this.wheels = wheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wheels: " + wheels);
    }

    @Override
    public double calculateMaintenanceCost() {
        return (2025 - year) * 150;
    }
}
