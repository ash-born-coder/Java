package javaCourse;

public class searchArray {
    public static void main(String[] args){

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        int target = 7;
        String target2 = "pineapple";
        boolean isFound = false;

        // in algorithms and data structure the we'll be performing a linear search

        for (int i = 0; i < numbers.length; i++){

            if (target == numbers[i]){

                System.out.println("Number Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Element not found in the array");
        }

        for (int j = 0; j < fruits.length; j++){

            //if (target == fruits[i]) -> this is not possible because since strings are reference data types we would end up comparing memory addresses
            // there fore we use the equals() method
            // fruits at index of 'i' ,call the built in equals method and pass 'target' as an argument
            if (fruits[j].equals(target2)){

                System.out.println("Fruit Element found at index: " + j);
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array");
        }

    }

}
