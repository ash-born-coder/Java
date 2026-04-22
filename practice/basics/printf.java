package javaCourse;

public class printf {
    public static void main(String[] args){

        // printf is an an alternative for print and println

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]


        //SPECIFIER CHARACTER
        /*String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Starting with %c\n",firstLetter);
        System.out.printf("You are %d year old\n", age);
        System.out.printf("You are %.1f cm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("\n%s is %d year old\n",name,age );*/

        //PRECISION POINT
        double price1 = 9.99;
        double price2 = 100000.15;
        double price3 = -54.01;

        System.out.printf("%.1f\n",price1); //this round off to 10
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.3f\n",price3);

        //FLAGS
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in a ()
        // space = displays a minus if negative, space if positive

        System.out.printf("\n%+.2f\n",price2);
        System.out.printf("%,.2f\n",price2);  //comma for every thousand
    }
}
