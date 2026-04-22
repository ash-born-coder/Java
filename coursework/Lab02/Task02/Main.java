package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[5];

        // Input grades
        for (int i = 0; i < grades.length; i++){
            System.out.printf("Student[%d]: ", i + 1);
            grades[i] = scanner.nextDouble();
        }

        System.out.println("\n=== Grade Report ===");
        for (int i = 0; i < grades.length; i++){
            char mark = grade(grades[i]);
            System.out.printf("Student[%d]: %.2f (%c)\n", i + 1, grades[i], mark);
        }

        System.out.println("\n=== Statistics === ");
        System.out.println("Average Grade: " + average(grades));
        System.out.println("Highest Grade: " + highest(grades));
        System.out.println("Lowest Grade: " + lowest(grades));
        System.out.println("Students Passed: " + passed(grades));
        System.out.println("Students Failed: " + failed(grades));

        scanner.close();
    }

    // Calculates the average grade
    static double average(double[] numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    // Returns the highest grade
    static double highest(double[] numbers){

        double largest = numbers[0];  // FIX: start with the first element

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }

    // Returns the lowest grade
    static double lowest(double[] numbers){

        double smallest = numbers[0];  // FIX: start with the first element

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    // Converts a number grade into a letter grade
    static char grade(double number){

        if (number >= 90){
            return 'A';
        }
        else if (number >= 80){
            return 'B';
        }
        else if (number >= 70){
            return 'C';
        }
        else if (number >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    // Counts how many students passed
    static int passed(double[] numbers){
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] >= 60){
                count++;
            }
        }
        return count;
    }

    // Counts how many students failed
    static int failed(double[] numbers){
        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < 60){
                count++;
            }
        }
        return count;
    }
}
