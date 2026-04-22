package javaCourse;

import java.util.Scanner;

public class compoudInterestCalculator {
    public static void main(String[] args){

        //COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100; //lets say the rate is 5, we dont want 5 we want the percent 5 which is 5/100

        System.out.print("Enter the number of times compounded per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + (rate/timesCompound), timesCompound * years);

        System.out.print("\n The amount that would be compounded after " + years + " will be: " + amount);

        scanner.close();

    }
}
