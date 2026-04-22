package Task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] randInt = new int[10];

        for (int i = 0; i < randInt.length; i++) {
            randInt[i] = random.nextInt(100) + 1;
        }

        // -------------------------------------- LINEAR SEARCH --------------------------------------

        System.out.println("Bubble Sort - * Before Sorting *");
        printArray(randInt);
        System.out.println();

        bubbleSort(randInt);

        System.out.println("Bubble Sort - * After Sorting *");
        printArray(randInt);

        // -------------------------------------- LINEAR SEARCH --------------------------------------

        System.out.print("\nEnter the number that you want to search with 'LINEAR SEARCH': ");
        int linSearch = scanner.nextInt();

        int linearIndex = linearSearch(randInt,linSearch);

        if (linearIndex != -1){
            System.out.println("Number is found by 'LINEAR SEARCH' at index: " + linearIndex);
        }
        else{
            System.out.println("Number not found;");
        }
        System.out.println("The number of comparisons: " + linSearchCount(randInt,linSearch));

        // -------------------------------------- BINARY SEARCH --------------------------------------

        System.out.print("\n\nEnter the number that you want to search with 'BINARY SEARCH': ");
        int binSearch = scanner.nextInt();
        int binaryIndex = binarySearch(randInt, binSearch);

        if (binaryIndex != -1){
            System.out.println("Number fount at: " + binaryIndex);
        }
        else{
            System.out.println(binaryIndex + " not found;");
        }

        scanner.close();

    }

    public static void bubbleSort(int[] array){

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1; j++){

                if(array[j] > array[j + 1]) {

                    int number = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = number;

                }
            }
        }
    }

    public static int linearSearch(int[] array, int target){

        for (int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int linSearchCount(int[] array, int target){

        int count = 0;

        for (int i = 0; i < array.length; i++){
            count++;
            if(array[i] == target) return count;
    }
        return count;
    }

    public static int binarySearch(int[] array, int target){

        int low = 0;
        int high = array.length - 1;

        while (low <= high){

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + middle);

            if(value < target){
                low = middle + 1;
            }
            else if(value > target){
                high = middle - 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }

    public static void printArray(int[] array){

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
