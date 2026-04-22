package Task03;


public class Main {
    public static void main(String[] args){

        // creating instances of the animals
        Bird blu = new Bird( "Blu", 1);
        Fish nemo = new Fish( "Nemo", 2);
        Duck donald = new Duck("Donald", 3);
        Dog scooby = new Dog( "Scooby-Doo", 5);

        // demonstrating polymorphism
        System.out.println("--- ANIMALS LIST ---");
        System.out.println();
        Animal[] animals = {blu, nemo, donald, scooby};

        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
            System.out.println();
        }

        // demonstrating interface polymorphism
        System.out.println("--- FLYING ANIMALS ---");
        /*(Flyable[] flyingAnimals = {blu, donald};
        for(Flyable flier : flyingAnimals) {
            flier.fly();
            System.out.println("Max Altitude: " + flier.getMaxAltitude() + " m");
            System.out.println();
        }*/

        for (Animal a : animals) {
            if(a instanceof Flyable){
                ((Flyable) a).fly();
                System.out.println("Max Altitude: " + ((Flyable)a).getMaxAltitude() + " m");
                System.out.println();
            }
        }

        System.out.println("--- SWIMMING ANIMALS ---");
        /*Swimmable[] swimmingAnimals = {nemo, donald};
        for(Swimmable swimmer : swimmingAnimals) {
            swimmer.swim();
            System.out.println();
        }*/

        for (Animal a : animals) {
            if(a instanceof Swimmable){
                ((Swimmable) a).swim();
                System.out.println();
            }
        }

        // demonstrating multiple inheritance (the duck)
        System.out.println("--- THE MULTI-TALENTED DUCK ---");
        /*donald.displayInfo();
        donald.fly();
        donald.swim();*/

        for (Animal a : animals) {
            if((a instanceof Swimmable) && (a instanceof Flyable)){
                ((Swimmable) a).swim();
                ((Flyable) a).fly();
                System.out.println();
            }
        }
    }
}
