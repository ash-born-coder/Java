package javaCourse;

import java.util.Scanner;

public class shoppingCartProgram {
    public static void main(String[] args){

        // >SHOPPING CART PROGRAM
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '€';
        double total = 0;

        System.out.print("Enter the item you want to buy: ");
        item = scanner.nextLine();

        System.out.print("Enter the price of a single item: ");
        price = scanner.nextDouble();

        System.out.print("Enter the amount of quantity you want in the item: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total price is " + total + "" + currency);






        scanner.close();
    }
}
