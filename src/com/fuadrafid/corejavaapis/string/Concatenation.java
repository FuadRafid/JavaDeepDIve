package com.fuadrafid.corejavaapis.string;

public class Concatenation {
    public static void main(String[] args) {
        //Concat operations are done left to right
        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64, because operations are done left to right
    }
}
