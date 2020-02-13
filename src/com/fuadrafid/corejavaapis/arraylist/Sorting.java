package com.fuadrafid.corejavaapis.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        //Collections.sort(List<T> lis), sorts in ascending order
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers); //[99, 81, 5]
    }
}
