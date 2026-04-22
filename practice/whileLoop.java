package javaCourse;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){

            // while loops = repeat some code forever
            //               while some condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";
        String response = "";
        int age = 0;
        int number = 0;


        /*
        if (name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }*/

        // if the user doesn't enter a name and skip the below is pointless and to stop that from happening we use while loop

        /*while(name.isEmpty()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }*/

        // after we enter the name we escape from the while loop

       /* System.out.println("Hello " + name);

        while (!response.equals("Q")){

            System.out.println("You are playing a Game");
            System.out.print("Press Q to quit: ");
            response = scanner.nextLine().toUpperCase(); //toUpperCase(); make it so that even if we enter 'q' it matches 'Q'

        }

        System.out.println("You have quit the game");*/

        //System.out.print("Enter your age: ");
        //age = scanner.nextInt();

        /*while (age < 0){
            System.out.println("Your age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }*/

        // now we are looping at something called do-while loop

        /*do {
            System.out.println("Your age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        while (age < 0);*/

        // with the do while loop we run the block of code and then look in to the condition

        //System.out.println("You are " + age + " years old");

        do{
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while (number < 1  || number > 10);

        System.out.println("You picked " + number);


        scanner.close();
    }

    public static class enterToArray {

        public static void main(String[] args){

            // here when we set a size4 of an array normally you can't change it
            //String[] foods = {"pizza","taco","hamburger"};

            // if we want to create an empty array we don't want to create an array with empty braces because we create an array of no elements
            // String [] foods  = {};
            //System.out.println(foods.length); //this give us zero
        }
    }
}
