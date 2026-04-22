package javaCourse.interfaces;

public class Main {
    public static void main(String[] args){

        // Interfaces = A blueprint for a class that specifies a set of abstract methods
        //              that implements classes MUST define.
        //              Supports multiple inheritance-like behaviour

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        // rabbit.hunt();  // rabbits don't have a hunt method
        // hawk.flee();  // hawks don't have a flee method

        System.out.println();

        fish.flee();
        fish.hunt();
    }
}
