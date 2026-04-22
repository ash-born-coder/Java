package javaCourse;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args){

        // Arithmetic Operators
/*         ____________________                                                                          */

        Scanner scanner = new Scanner(System.in);

        int x = 10;
        int y = 2;
        int z;

        System.out.print("Enter the relavant operation: ");
        int operation = scanner.nextInt();


        switch(operation){
            case 1:
                System.out.println("Addition");
                z = x + y;
                System.out.println(z);
                break;

            case 2:
                System.out.println("Subtraction");
                z = x - y;
                System.out.println(z);
                break;

            case 3:
                System.out.println("Multiplication");
                z = x * y;
                System.out.println(z);
                break;

            case 4:
                System.out.println("Division");
                z = x / y;
                System.out.println(z);
                break;

            case 5:
                System.out.println("Modulus");
                z = x % y;
                System.out.println(z);
                break;

            default:
                System.out.println("There is no such operation");


                scanner.close();
        }



        // Augmented Assigned Operators
//         ____________________________

        //int x = 10;
        //int y = 3;

        //x = x + y;
        //x += y;

        //x = x - y;
        //x -= y;

        //x = x * y;
        //x *= y;

        //x = x / y;
        //x /= y;

        //x = x % y;
        //x %= y;

        // Increment and Decrement Operators
//         _________________________________

        // int x = 1;

        //x = x + 1;
        //x += 1;
        //x++;

        //x = x - 1;
        //x -= 1;
        //x--;

        // Order of Operations [P-E-M-D-A-S]
        // P - parenthesis
        // E - exponent
        // M - multiplication
        // D - division
        // A - addition
        // S - subtraction
    }
}
