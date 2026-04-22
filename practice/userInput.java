package javaCourse;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

    /*    System.out.print("Enter you name:");
        String name = scanner.nextLine();

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa:");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " year old");
        System.out.println("You have a gpa of: " + gpa );

        if (isStudent){
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enrolled");
        }*/
        // COMMON ISSUE
        /*System.out.println("\nCOMMON ISSUE");
        System.out.print("Enter your favourite number: ");
        int favNumber = scanner.nextInt();

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("Your favourite number is: " + favNumber);
        System.out.println("Your favourite color is: " + color);*/
/* Here this give out a weird answer and the reason is for example if we write 22 and press enter within the input
buffer there still lies the new line character(\n) because we pressed enter. THe 'scanner.nextInt()' reads only the
number 22. BUt the ENTER KEY you pressed leaves behind a newline character (\n) in the input buffer. Next line calls
'scanner.nextLine()', nextLine() reads everything up to the next line. BUt since the buffer already starts with a
newline(\n), it immediately consumers it, resulting 'color' to be an empty string("")*/

/* This here is s common problem in Java, if you accept an INTEGER or a DOUBLE and then accept a STRING of text.*/

       /* System.out.println("\nHow it looks after the problem is solved");

        System.out.print("Enter your favourite year: ");
        int favYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Favourite anime: ");
        String favAnime = scanner.nextLine();

        System.out.println("Your favourite year is: " + favYear);
        System.out.println("Your favourite Anime is: " + favAnime);*/

        //Calculate teh area of a triangle

        double width = 0;
        double height = 0;
        double length = 0;

        System.out.print("Enter the required height: ");
        width = scanner.nextDouble();

        System.out.print("Enter the required width: ");
        height = scanner.nextDouble();

        System.out.print("Enter the required length: ");
        length = scanner.nextDouble();

        double volume = width * height * length;

        System.out.print("\nThe resulting volume of the data entered: " + volume + "cm³");



        scanner.close();

    }
}
