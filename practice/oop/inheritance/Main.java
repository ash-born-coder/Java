package javaCourse.inheritance;

public class Main {
    public static void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //               from another class
        //               Child(Dog, Cat) <- Parent(Animal) <- Grandparent(Organisms)

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        plant.photosynthesize();
        //dog.photosynthesize();  dogs do not inherit this method, there is not photosynthesize method on dog
    }
}
