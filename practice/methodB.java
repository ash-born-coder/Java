package javaCourse;

public class methodB {
    public static void main(String[] args){

        int age = 17;

        double result = square(3);
        double result2 = cube(3);

        String result3 = getFullName("Spongebob", "Squarepants");

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        if (ageCheck(age)){
            System.out.println("You are old enough!");
        }
        else {
            System.out.println("You are not old enough!");
        }
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
    }

}
