package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Person person1 = new Person("Monkey", "Luffy", 3,4,2003);
        Person person2 = new Person("Ash","Ketchum",2,3,2004);
        Person person3 = new Person("Jin","Sakai",4,8,1500);

        System.out.println("MOIN!\n");

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("Press 1,2 & 3 from the numbers sa to which person wants to change their name.\nNumber 0 to" +
                    " terminated to the program and Number 4 to display all the results: ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("PROGRAM TERMINATED");
                break;

            } else if (number == 1) {
                person1.changeName();
            } else if (number == 2) {
                person2.changeName();
            } else if (number == 3) {
                person3.changeName();
            } else if (number == 4) {

                person1.displayName();
                person2.displayName();
                person3.displayName();

            } else {
                System.out.println("WRONG INPUT");
            }
        }

        scanner.close();
    }



}
