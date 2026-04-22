package javaCourse;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args){

        // for loop = execute a certain code a CERTAIN amount of time

        // 1. for initialization
        // 2. condition
        // 3. step or update (increment or decrement)

        /*for (int i = 0; i < 10; i++){

            //System.out.println("pizza");
            System.out.println(i);
        }

        System.out.println();

        // decrementing
        for (int j = 10; j > 0; j--) {

            System.out.println(j);
        }

        System.out.println();

        //incrementing by 2
        for (int k = 0; k < 10; k += 2){

            //System.out.println("pizza");
            System.out.println(k);
            // this is possible for increments ad decrements of 2,3,4....*/

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int  i = 1; i <= max; i++){

            System.out.println(i);
        }


        scanner.close();
    */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown you want: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){

            System.out.println(i);
        }
        System.out.println("Happy New Year");

        scanner.close();

    }

}
