package Task02;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("Toyota", "CAMRY", 2020, 4),
                new Motorcycle("Harley Davidson", "FAT BOB", 2021, 2),
                new Truck("Ford", "F-150", 2019, 1500)
        };

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].displayInfo();
            System.out.println("Maintenance Cost: $" + vehicles[i].calculateMaintenanceCost());
            System.out.println();
        }
    }
}
