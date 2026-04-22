package Task03;

public class Duck extends Animal implements Flyable, Swimmable{

    public Duck(String name, int age){

        super(name, "Duck", age);

    }

    @Override
    public void makeSound(){
        System.out.println("Quack!");
    }

    @Override
    public void fly(){
        System.out.println(name + " is flying over the pond!");
    }

    @Override
    public void swim(){
        System.out.println(name + "is swimming in the water!");
    }

}
