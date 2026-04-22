package javaCourse;

import java.util.Random;

public class randomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        int number1;      //int
        int number2;
        int number3;
        double number4;   //double
        double number5;
        boolean isHeads;  //boolean

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);
        number4 = random.nextDouble();
        number5 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);

        if (isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
