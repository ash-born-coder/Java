package Task1;

import java.util.Scanner;

public class Person {

    String firstName;
    String lastName;
    int nameChangeDay;
    int nameChangeMonth;
    int nameChangeYear;

    Person(String firstName, String lastName, int nameChangeDay, int nameChangeMonth, int nameChangeYear){

        this.firstName = firstName;
        this.lastName = lastName;
        this.nameChangeDay = nameChangeDay;
        this.nameChangeMonth = nameChangeMonth;
        this.nameChangeYear = nameChangeYear;
    }

    void displayName(){

        System.out.println();

        System.out.println("Your FIRST NAME: " + this.firstName);
        System.out.println("Your LAST NAME: " + this.lastName);
        System.out.println("Your DAY: " + this.nameChangeDay);
        System.out.println("Your MONTH: " + this.nameChangeMonth);
        System.out.println("Your YEAR: " + this.nameChangeYear);

    }

    Scanner scanner1 = new Scanner (System.in);

    void changeName(){

        System.out.print("Enter the FIRST NAME: ");
        String newFirstName = scanner1.nextLine();

        System.out.print("Enter the LAST NAME: ");
        String newLastName = scanner1.nextLine();

        System.out.print("Enter the DAY: ");
        int newChangeDay = scanner1.nextInt();

        System.out.print("Enter the MONTH: ");
        int newChangeMonth = scanner1.nextInt();

        System.out.print("Enter the YEAR: ");
        int newChangeYear = scanner1.nextInt();

        if (newChangeYear - this.nameChangeYear >= 3){

            this.firstName = newFirstName;
            this.lastName = newLastName;
            this.nameChangeDay = newChangeDay;
            this.nameChangeMonth = newChangeMonth;
            this.nameChangeYear = newChangeYear;
        }
        else{

            System.out.println("\nName to be changed only after 3 years.");
        }

    }


}
