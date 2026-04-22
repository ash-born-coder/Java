package javaCourse;

import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args){

        // nested loop = A loop inside another loop
        //               Used often with Matrices and DS&A
/*
        for(int i = 1; i <= 9; i++){

            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 1; i <= 9; i++){

            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 1; i <= 9; i++){

            System.out.print(i + " ");
        }*/

        // instead of the above method of typing it over and over again we are using a nested loop

        /*

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }*/

        // small project

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the relevant symbol: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i <= rows; i++){

            for(int j = 0; j <= columns; j++){

                System.out.print(symbol + " ");
            }
            System.out.println();
        }


        scanner.close();



    }
}
