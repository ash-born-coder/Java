package javaCourse.wrapperClass;

import java.sql.SQLOutput;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args){

        // Wrapper Class = Allow primitive values(int, char, double, boolean)
        //                 to be used as objects. "Wrap them in an object"
        //                 Generally, don't wrap primitives unless you need an object
        //                 Allows use of Collections Framework and Static Utility Methods.

        // Autoboxing
        //Integer a = 123;
        //Double b = 3.14;
        //Character c = '$';
        //Boolean d = true;
      //String a = "Car" - this is exactly like we write strings

        // Unboxing
        //int x = a;  // we're taking a primitive thats wrapped in an object and unboxing/unwrapping it(setting it back to its primitive)

        //now we are using wrapper classes(Integer, etc) to convert the primitive data types(123, 3.14, etc) into Strings
        // if you need convert a primitive to a String, use that primitive data types wrapper class and call the toString Method

        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;

        System.out.println(x);

//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
        //boolead d = Boolean.parseBoolean("true");
    }
}
