package Task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        int choice = -1;

        while (choice != 0) {
            System.out.println("Inventory Menu");
            System.out.println("1. Add Item");
            System.out.println("2. Restock Item");
            System.out.println("3. Sell Item");
            System.out.println("4. Search by ID");
            System.out.println("5. Search by Name");
            System.out.println("6. Low Stock Items");
            System.out.println("7. Inventory Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("Quantity: ");
                int qty = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();

                inventory.addItem(new Item(name, id, qty, price));
                System.out.println("Item added.");

            } else if (choice == 2) {
                System.out.print("Enter ID to restock: ");
                int id = scanner.nextInt();
                System.out.print("Quantity to add: ");
                int qty = scanner.nextInt();

                if (inventory.restock(id, qty))
                    System.out.println("Restocked.");
                else
                    System.out.println("Invalid operation.");

            } else if (choice == 3) {
                System.out.print("Enter ID to sell: ");
                int id = scanner.nextInt();
                System.out.print("Quantity to sell: ");
                int qty = scanner.nextInt();

                if (inventory.sell(id, qty))
                    System.out.println("Sold.");
                else
                    System.out.println("Invalid operation.");

            } else if (choice == 4) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                Item item = inventory.searchByID(id);
                System.out.println(item != null ? item : "Not found");

            } else if (choice == 5) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                Item item = inventory.searchByName(name);
                System.out.println(item != null ? item : "Not found");

            } else if (choice == 6) {
                inventory.displayLowStock();

            } else if (choice == 7) {
                inventory.printReport();

            } else if (choice == 0) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
