package se.oscar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Apple");
        list.add("Strawberry");
        System.out.println(list.get(0));
        System.out.println(list.get(2));

        list.set(1, "Dragon fruit");

        for (String fruit : list) {
            System.out.println(fruit);
        }

//        ArrayList untypedList = new ArrayList();
//        untypedList.add("Banana");
//        untypedList.add(404);
//        String text = (String) untypedList.get(0);
//        Integer number = (Integer) untypedList.get(1);


    }
}