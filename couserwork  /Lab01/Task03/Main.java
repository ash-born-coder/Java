/*
 * Name :- Chanuka Ashan Gunawardena
 * Lab Group :- 01
 * Module :- SO2
 * Lab :- 01
 * Task :- ROMAN NUMERAL CONVERTER
 */
package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired Roman Numeral: ");
        String roman = scanner.nextLine();  // for scanning the input

        int letterLength = roman.length();  // this is where we get the length of String

        int sum = 0;

        for (int i = 0; i < letterLength; i++){  // here we are going through the String numeral one by one
            char firstLetter = roman.charAt(i);  // here we use the charAt method to go through the String

            // first we check the first Numeral
            int currentValue = romanScanner(firstLetter);

            // at the same time here we check if there is another numeral waiting to come
            if (i < letterLength - 1){

                // if so concurrently we check the next value as well
                int nextValue = romanScanner(roman.charAt(i + 1));

                // if the next value is bigger than the first we don't add but subtract
                if (currentValue < nextValue){

                    sum = sum - currentValue;
                    continue;
                }
            }

            sum = sum + currentValue;

        }
        System.out.println();
        System.out.println("The corresponding Arabic Number is: " + sum);

        scanner.close();

    }

    // separate static method to call upon the required numerals
    static int romanScanner(char c) {
        if (c == 'I') {
            return 1;
        }
        if (c == 'V') {
            return 5;
        }
        if (c == 'X') {
            return 10;
        }
        if (c == 'L'){
            return 50;
        }
        if (c == 'C'){
            return 100;
        }
        if (c == 'D'){
            return 500;
        }
        if (c == 'M'){
            return 1000;
        }
        return 0;

    }

}
