package Task1;

import java.util.Scanner;

public class Main {

    private static final int MAX_ANZAHL = 3;

    public static void main(String[] args){

        Student[] students = new Student[MAX_ANZAHL];
        students[0] = new Student("Ash", "Ketchem",2,5,2003);
        students[1] = new Student("Monkey","Luffy",3,4,2004);
        students[2] = new Student("Julio","Band",2,3,2001);

        System.out.println("MOIN!\n");

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Press 1,2 & 3 from the numbers as to which person wants to change their name.\nNumber 0 to terminated to the program.");
            System.out.println((MAX_ANZAHL + 1) + " - Display all students");
            System.out.println((MAX_ANZAHL + 2) + " - Display maximum students");
            System.out.print("Number Entered: ");
            int number = scanner.nextInt();

            System.out.println();

            if (number == 0) {
                System.out.println("PROGRAM TERMINATED");
                break;

            } else if (number == 1) {
                students[0].changeName();
            } else if (number == 2) {
                students[1].changeName();
            } else if (number == 3) {
                students[2].changeName();
            }
            else if (number == MAX_ANZAHL + 1) {
                for (int i = 0; i < students.length; i++) {
                System.out.println("------------");
                students[i].displayInfo();
                }
            } else if (number == MAX_ANZAHL + 2) {
            System.out.println("Maximum manageable students: " + MAX_ANZAHL);
            }
            else{
                System.out.println("Wrong Input");
            }
        }

        scanner.close();
    }

}
