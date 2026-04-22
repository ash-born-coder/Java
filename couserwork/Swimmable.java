package Task03;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];

        animals[0] = new Bird("Pidgy", 2);
        animals[1] = new Fish("Sharky", 2);
        animals[2] = new Duck("Quacky", 3);
        animals[3] = new Dog("Bowey", 5);

        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];

            System.out.println();

            animals[i].displayInfo();
            animals[i].makeSound();

        if (a instanceof Flyable) {
            Flyable flyingAnimal = (Flyable) a;
            flyingAnimal.fly();
        }

        if (a instanceof Swimmable) {
            Swimmable swimmingAnimal = (Swimmable) a;
            swimmingAnimal.swim();
        }
        }
    }
}
