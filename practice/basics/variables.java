package javaCourse;

public class variables {


    public static void main(String[] args){
    // 1.Introduction
/*     ------------                                                                                      */
        System.out.print("1.Introduction");
        System.out.println("Hello World!\n");
        System.out.print("I like pizza!");


    // 2.Variables
/*     -----------                                                                                       */
        int age;
        age = 21;
        System.out.println(age);
/* Here the above shows the 2 separate steps in creating javaCourse.variables
                        1. Declaration
                        2. Assignment
_________________________________________________________________________________________________________*/

        int year = 2025;
        System.out.println("\nThe year is " + year);

        double price1 = 19.999;
        double price2 = 19;
        System.out.println("The system price are " +price1);
        System.out.println("The system price are " +price2);
/* Here we can see that using different numerical data types can be beneficial and as well as their
traits. For example as mentioned above even when writing whole numbers when using the double data type
will create a '.0' at the end of execution.
_________________________________________________________________________________________________________*/

        char grade = 'A';
        char symbol = '?';
        char currency = '$';

        System.out.println("\n"+grade);
        System.out.println(symbol);
        System.out.println(currency);
/* Here we have the demonstration of using 'char' where we have to use apostrophes before and after the
character
_________________________________________________________________________________________________________*/

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println("\n"+isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        //this is a future topic of using 'if statements'

        /* if(condition) {block of code to be executed} */
        if (isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are NOT a student!");
        }

        if (forSale)
        {
            System.out.println("It is for Sale");
        }
        else {
            System.out.println("It is NOT for sale");
        }
/* Here it show that boolean data type is a fundamental data type that can hold one of two possible values:
 true or false.
 _________________________________________________________________________________________________________*/

        String name = "AshBorn";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String colour = "red";

        System.out.println("\nHello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("The price is " + price1);
        // here we are trying to print multiple javaCourse.variables together ina single print statement
        System.out.println("Your choice is a " + colour + " " + year + " " + car);
        System.out.println("Your choice is a " + colour + year + car);

        if (forSale){
            System.out.println("There is a " + car + "for sale");
        }
        else {
            System.out.println("The " + car + " is not for sale");
        }
/* Here we can see that similar to 'char' we are using double apostrophes on either side of the string of letters
and also during the usage of the String data type we consider numerical like 1,2,3...etc. as characters
and not as integers*/


    }
}
