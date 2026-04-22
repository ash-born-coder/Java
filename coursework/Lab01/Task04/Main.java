/*
* Name :- Chanuka Ashan Gunawardena
* Lab Group :- 01
* Module :- SO2
* Lab :- 01
* Task :- GRADE MANAGER
*/
package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int numofStudents;
        double[] grades;  // opening an array

        System.out.println();

        System.out.print("How many student do you want to enter grades for: ");
        numofStudents = scanner.nextInt();

        System.out.println();

        grades = new double[numofStudents];  // assigning the size of the array

        for (int i = 0; i < numofStudents; i++){  // entering the grades to their corresponding indices starting from zero

            System.out.printf("Student[%d]: ", i + 1);
            grades[i] = scanner.nextDouble();

        }

        System.out.println();

        System.out.println(" === Grade Report === ");  // printing the results with grades

        for (int i = 0; i < numofStudents; i++){

            char mark = grade(grades[i]);
            System.out.printf("Student[%d]: %.2f (%c)\n", i + 1, grades[i],mark);
        }

        System.out.println();

        System.out.println(" === Statistics === ");
        // passing the grades in the array to methods to get the required Statistics
        System.out.println("Average Grade: " + average(grades));
        System.out.println("Highest Grade: " + highest(grades));
        System.out.println("Lowest Grade: " + lowest(grades));
        System.out.println("Students passed: " + passed(grades));
        System.out.println("Students failed: " + failed(grades));



        scanner.close();
    }

    // * Since we don't know the number of arguments to be passed into the parameters of methods we're using variable arguments *

    // this method calculates the average
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;  // in case of passing 0 as arguments
        }

        for(int i = 0; i < numbers.length; i++){

            sum = sum + numbers[i];
        }

        return sum / numbers.length; //adding all the values and dividing by the number of values
    }

    // this method returns the highest value in the array
    static double highest(double... numbers){

        double largest = 0;

        for(int i = 0; i < numbers.length; i++){ // looping through the array until you find the highest grade
            if(numbers[i] > largest){

                largest = numbers[i];
            }
        }
        return largest;
    }

    // this method returns the lowest values in the array
    static double lowest(double... numbers){

        double smallest = 100;

        for(int i = 0; i < numbers.length; i++){  // looping through the array until you find the lowset grade
            if(numbers[i] < smallest){

                smallest = numbers[i];
            }
        }
        return smallest;
    }

    // the method give marks corresponding to the achieved grade
    static char grade(double numbers){

        if (numbers >= 90 && numbers <= 100){
            return 'A';
        }
        else if (numbers >= 80 && numbers <= 89){
            return 'B';
        }
        else if (numbers >= 70 && numbers <= 79){
           return 'C';}
        else if (numbers >= 60 && numbers <= 69) {
            return 'D'; }
        else
            return 'F';

    }

    // this method says if the student has passed
    static int passed(double... numbers){
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] >= 60){
                sum = 1 + sum;
            }
        }
        return sum;
    }

    // this method says if the student has failed
    static int failed(double... numbers){
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < 60){
                sum = 1 + sum;
            }
        }
        return sum;
    }
}
