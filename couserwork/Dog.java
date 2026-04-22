package Task03;

public class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying in the sky.");
    }
}