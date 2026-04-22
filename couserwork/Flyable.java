package Task03;

public class Fish extends Animal implements Swimmable {

    public Fish(String name, int age) {
        super(name, "Fish", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Swish swish!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming in the water.");
    }
}