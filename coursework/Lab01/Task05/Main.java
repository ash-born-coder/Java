/*
 * Name :- Chanuka Ashan Gunawardena
 * Lab Group :- 01
 * Module :- SO2
 * Lab :- 01
 * Task :- SIMPLE CALCULATOR WITH METHODS
 */
package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println();
        System.out.println("=== Simple Calculator ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.println();


        Scanner scanner = new Scanner(System.in);

        while(true) {

        // this helps to exit the operation whenever needed
        System.out.print("Choose the operation (1-5): ");
        int operationChoice = scanner.nextInt();

        if (operationChoice == 5){
            System.out.println("Exiting the program");
            break;
        }

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

            if (operationChoice == 1) {

                double addSum = addition(firstNumber, secondNumber);  //calling the addition method
                System.out.println("Result: " + addSum);
            } else if (operationChoice == 2) {

                double minusSum = subtraction(firstNumber, secondNumber);  // calling the subtraction method
                System.out.println("Result: " + minusSum);
            } else if (operationChoice == 3) {

                double multiplySum = multiplication(firstNumber, secondNumber);  // calling the multiplication method
                System.out.println("Result: " + multiplySum);
            } else if (operationChoice == 4) {

                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");  // if by any chance a division of zero might occur
                } else {
                    double divideSum = division(firstNumber, secondNumber);  // calling the division method
                    System.out.println("Result: " + divideSum);
                }
            }

        }
        scanner.close();

    }

    static double addition(double firstNumber, double secondNumber){

        return firstNumber + secondNumber;
    }

    static double subtraction(double firstNumber, double secondNumber){

        return firstNumber - secondNumber;
    }

    static double multiplication(double firstNumber, double secondNumber){

        return firstNumber * secondNumber;
    }

    static double division(double firstNumber, double secondNumber){

        return firstNumber / secondNumber;
    }
}
