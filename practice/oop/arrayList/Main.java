package javaCourse.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //ArrayList = A resizable array that stores objects(autoboxing)
        //            Arrays are fixed in size but ArrayLists can change

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(3);
//        list.add(1);
//        list.add(2);
//
//        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Banana");

        System.out.println(fruits);

    }

}
