package Task01;

import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int nameChangeDay;
    private int nameChangeMonth;
    private int nameChangeYear;

    private static int personCount = 0;

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

        setNameChangeMonth(newChangeMonth);

        System.out.print("Enter the YEAR: ");
        int newChangeYear = scanner1.nextInt();

        if (newChangeYear - this.nameChangeYear >= 3){

            this.firstName = newFirstName;
            this.lastName = newLastName;
            this.nameChangeDay = newChangeDay;
            this.nameChangeMonth = newChangeMonth;
            this.nameChangeYear = newChangeYear;
            personCount++;
        }
        else{

            System.out.println("\nName to be changed only after 3 years.");
        }

    }

    public String getfirstName(){
        return this.firstName;
    }

    public String getlastName(){
        return this.lastName;
    }

    public int getNameChangeDay(){
        return this.nameChangeDay;
    }

    public int getNameChangeMonth(){
        return this.nameChangeMonth;
    }

    public int getNameChangeYear(){
        return this.nameChangeYear;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public String setfirstName(){
        return this.firstName;
    }

    public String setlastName(){
        return this.lastName;
    }

    public int setNameChangeDay(){
        return this.nameChangeDay;
    }

    public void setNameChangeMonth(int month){

        if(month <=12  && month >= 1) {
            this.nameChangeMonth = month;
        }
        else{
            System.out.println("Month entered is INVALID");
        }
    }

    public int setNameChangeYear(){
        return this.nameChangeYear;
    }

    public void displayInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Last change date: " + nameChangeDay + "/" + nameChangeMonth + "/" + nameChangeYear);
    }

}
