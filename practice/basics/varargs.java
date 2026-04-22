package javaCourse;

public class varargs {
    public static void main(String[] args){

            // varagrs = allow a Method to accept a varying number of arguments
            //           makes methods more flexible, no need for overloaded methods
            //           java will pack the arguments into the array
            //           ... (ellipsis)

        // overloaded methods are methods with the same name but with different parameters

        // here the java compiler is packing all of the sums into an array when we send them into a method
        System.out.println(add(1,2,3,4));

        System.out.println();

        System.out.println(average(1,2,3,4,5,6,7));
        System.out.println(average()); // here we are dividing by zero since the length of the array is zero

    }

    static int add(int... numbers){
        int sum = 0;

        for (int number: numbers){
            sum = sum + number;
        }

        return sum;
    }

    static double average(double... nums){
        double sum = 0;

        if (nums.length == 0){
            return 0;
        }

        for (double num: nums) {
            sum = sum + num;
        }
        return sum / nums.length;
    }

}
