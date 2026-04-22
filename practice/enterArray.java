package javaCourse;

import java.util.Scanner;

public class enterArray {
    public static void main(String[] args){

        // once you set a size for the array you can't change it
        // String[] foods = {"pizza", "taco","hamburger"};

        // to create an empty array you don't want to setup a pair of empty braces
        //String[] foods = {};

        //and also we cannot attempt to assign any values for the empty array
        //foods[0] = "pizza";

        //System.out.println(foods.length);  // this would just give you zero

        // *** before we assign values we want to set a size for the array even if it is empty ***

        // this is how we do it
        // here we are creating an empty array that has size for 3 elements
      /*  String[] foods = new String[3];

        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "hamburger";
        System.out.println(foods.length);

        System.out.println();

        //enhanced for loop
        for(String food: foods){
            System.out.println(food);
        }*/

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("What number of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();  // to clear the scanner

        System.out.println();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++){

            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();

        }

        System.out.println();

        for (String food: foods){
            System.out.println(food);
        }


        scanner.close();


    }
}
