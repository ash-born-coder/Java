package javaCourse;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // if statements = performs a block of code it its condition is true

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student?(true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1

        if (name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else {
            System.out.println("Hello " + name);
        }

        //Group 2

        if(age >= 65){
            System.out.println("You are a senior"); //if statements are checked from top to bottom therefore this line of code will not work if the below condition were to be written on top of this code
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age < 0){
            System.out.println("Don't be absurd!");
        }
        else if(age == 0){
            System.out.println("Seems like you were just born");
        }
        else {
            System.out.println("You are a child!");

            scanner.close();
        }

        // Group 3

        if (isStudent) {
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are not a student!");
        }


    }
}
