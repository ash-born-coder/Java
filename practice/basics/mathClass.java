package javaCourse;

import java.util.Scanner;

public class mathClass {
    public static void main(String[] args){

        System.out.println(Math.PI);  //this give the pi
        System.out.println(Math.E);   //this give the Euler's number

        double result;

        result = Math.pow(2, 3);   //this is how to use the power
        result = Math.abs(-5);     //this give the absolute value of the number inside the bracket
        result = Math.sqrt(9);     //this gives the square root of the value inside the bracket
        result = Math.round(3.14); //this round the number to the nearest integer
        result = Math.ceil(3.14);  //this round off to the nearest high integer
        result = Math.floor(3.99); //this round off to the nearest liw integer
        result = Math.max(10, 20); //chose the highest number from the numbers in the bracket
        result =  Math.min(10, 20); //chose the minimum number from the numbers in th bracket

        //System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        //HYPOTENUSE
        /*
        double length1;
        double length2;
        double sum;
        double hypotenuse;

        System.out.print("Enter the length of the side: ");
        length1 = scanner.nextDouble();

        System.out.print("Enter the length of the remaining side: ");
        length2 = scanner.nextDouble();

        sum = Math.pow(length1, 2) + Math.pow(length2, 2);
        hypotenuse = Math.sqrt(sum);

        System.out.println("According to the given information the hypotenuse of the triangle is: " + hypotenuse);
*/

        //circumference of a circle
        //area of a circle
        //volume of a circle

        // use System.out.printf(" so we can use the place holder-%f-with desired decimal-eg. %.1f-for one decimal")
        scanner.close();




    }
}
