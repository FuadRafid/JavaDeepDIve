package com.fuadrafid.arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");
    }
}
