package javaCourse;

public class methodA {
    public static void main(String[] args){

        // method = a block of reusable code that is executed when called

        // without using the method we can paste the above block of code as much as we want
        /*
        1.
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

        2.
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");

        3.
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old!");
        System.out.println("Happy Birthday to you!\n");
    */
        // and also methods are unfamiliar with any variables declared in other methods

        String name = "Spongebob";
        String name2 = "Born";
        int age = 22;
        int age2 = 23;

        happyBirthday(name, age);
        happyBirthday(name2, age2);
    }
     // since we are making a new method it should be outside of the main method
    static void happyBirthday(String x, int y){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",x);
        System.out.printf("You are %d years old!\n",y);
        System.out.println("Happy Birthday to you!\n");

    }
}
