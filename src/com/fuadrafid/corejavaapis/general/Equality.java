package com.fuadrafid.corejavaapis.general;

import java.util.ArrayList;

public class Equality {
    public static void main(String[] args) {
        // == checks if the objects have same reference
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder("a");
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false, because they have different reference
        System.out.println(one == three); // true, because they have the same reference
        System.out.println("Hashcode of one: "+one.hashCode()+" Hashcode of three: "+three.hashCode());
        System.out.println(one.equals(two)); // StringBuilder has no implementation of equals, so by default it checks one == two


        // equals also matches hashcode, not content, if not implemented
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String[] againBugs = {"cricket", "beetle", "ladybug"};
        System.out.println(againBugs.equals(bugs));
        System.out.println(againBugs.toString());


        //equals check if object has same values usually, if implemented. Also, two equal object must have the same hashcode
        ArrayList list = new ArrayList();
        ArrayList anotherList = new ArrayList();
        list.add("1");
        anotherList.add("1");
        System.out.println("list == anotherList: "+ (list == anotherList)); // checks reference
        System.out.println("list.equals(anotherList): "+ (list.equals(anotherList))); //checks equals
        System.out.println("Hashcode of list: "+list.hashCode()+" Hashcode of anotherList: "+anotherList.hashCode());


    }
}
