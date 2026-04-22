package Task03;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}