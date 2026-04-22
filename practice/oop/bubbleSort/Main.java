package javaCourse.bubbleSort;

public class Main {
    public static void main(String[] args){

        int[] array = {9,1,8,2,7,3,6,4,5};

        bubbleSort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int array[]){

        for (int i = 0; i < array.length - 1; i++){  // array.length - 1 is since we use the [j + 1] term so it doesn't go out of bounds
            for(int j = 0; j < array.length - 1; j++){  // the second loop is so that we dont end only after one iteration and get all the numbers in order
            if (array[j] > array[j+1]) {
                int larger = array[j];
                array[j] = array[j + 1];
                array[j + 1] = larger;
            }
            }

        }

    }
}
