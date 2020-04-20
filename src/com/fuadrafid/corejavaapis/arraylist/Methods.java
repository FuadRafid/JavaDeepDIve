package com.fuadrafid.corejavaapis.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        //boolean add(E element)
        //void add(int index, E element)

        ArrayList list = new ArrayList();// this assumes you are storing objects
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list); // [hawk, true]

        ArrayList<String> safer = new ArrayList<>();// can only keep String values
        safer.add("sparrow");
        //safer.add(Boolean.TRUE); -- DOES NOT COMPILE

        //add by index
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]


        //boolean remove(Object object)
        //E remove(int index)

        birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints true
        System.out.println(birds.remove(0)); // prints hawk
        System.out.println(birds); // []

        //E set(int index, E newElement)//

        birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.size()); // 1
        birds.set(0, "robin"); // [robin]
        System.out.println(birds.size()); // 1
        birds.set(1, "robin");

    }
}
