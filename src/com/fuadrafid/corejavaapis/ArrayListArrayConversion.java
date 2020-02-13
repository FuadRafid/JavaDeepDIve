package com.fuadrafid.corejavaapis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListArrayConversion {
    public static void main(String[] args) {

        //ArrayList to Array
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray(); // return an Object[]
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[2]); // returns the type in the parameter, also adjusts size if the array in the parameter is smaller in size
        System.out.println(stringArray.length); // 2
        System.out.println(list.toArray(new String[4]).length); // 4

        //Array to ArrayList, see carefully, they are linked.
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list2 = Arrays.asList(array); // returns fixed size list
        System.out.println(list2.size()); // 2
        list2.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        System.out.println(Arrays.toString(array)); // new test
//        list2.remove(1); //UnsupportedOperationException, because both are linked and cannot change the size of array in java.

        //To avoid this linking issue.
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, array);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);

        //Using varargs
        List<String> listVarargs = Arrays.asList("one", "two");
    }
}
