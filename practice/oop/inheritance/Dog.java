package javaCourse.inheritance;

public class Dog extends Animal{

    // the 'Dog' class will inherit all the trait (attributes and methods) from the animal class

    int lives = 1;

    void speak(){
        System.out.println("The Dog goes *woof*");
    }

}
