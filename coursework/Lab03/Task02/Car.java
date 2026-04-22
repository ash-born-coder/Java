package Task02;

public class Car extends Vehicle {

    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }

    @Override
    public double calculateMaintenanceCost() {
        return (2025 - year) * 150;
    }
}
