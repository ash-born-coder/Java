package javaCourse.getterAndSetter;

public class Car {

    private final String model;  // as an extra security measure we can add the keyword 'final' and upon this the model can't be change no matter what
    private String color;
    private int price;

    Car(String model, String color, int price){

        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        this.price = price;
    }

}
