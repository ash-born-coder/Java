package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount(10000,"Ash");

        System.out.println(" *** WELCOME TO EUROBANK *** ");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Check Balance \n2. Make Deposit \n3. Make Withdrawal \n4. Display Account info \n0. Exit" );
            System.out.println();

            System.out.print("Enter the number to your corresponding request: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Balance: $" + bankAccount.getBalance());

            } else if (choice == 2) {
                System.out.print("Enter the amount you want to deposit: ");
                double debit = scanner.nextDouble();
                bankAccount.deposit(debit);

            } else if (choice == 3) {
                System.out.print("Enter the amount you want to withdraw: ");
                double credit = scanner.nextDouble();
                if (bankAccount.withdrawal(credit)) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Error: Insufficient funds or invalid amount.");
                }
            } else if (choice == 4) {
                System.out.println("Account Name: " + bankAccount.getAccountHolder());

            } else if (choice == 0) {
                System.out.println("EXIT");
                break;
            }
            else{
                System.out.println("Error");
                break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
