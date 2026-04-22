package javaCourse;

import java.util.Arrays;

public class array {
    public static void main(String[] args){

        // array = a collection of values of the same data type
        //        * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        // each element within the array is known as an element

        //System.out.println(fruits);  // arrays fall under reference data type, if we access the name of our array we get a memory address
        System.out.println(fruits[0]);

        fruits[0] = "pineapple";

        //to check the number of elements in an array
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        System.out.println();

        // to print all of the elements within an array we use a for loop

        for (int i = 0; i < numOfFruits; i++){
            System.out.println(fruits[i]);
        }

        System.out.println();

        Arrays.sort(fruits); // here we use a sort method to sort the fruits alphabetically

        //enhanced for loop
        // within the parenthesis, the data type of the array followed by a unique identifier for each element
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
