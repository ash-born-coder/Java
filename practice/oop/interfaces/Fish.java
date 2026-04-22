package javaCourse.interfaces;

public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("**Fish flee from larger fish**");

    }

    @Override
    public void hunt(){
        System.out.println("**Fish hunt smaller fish**");
    }
}
