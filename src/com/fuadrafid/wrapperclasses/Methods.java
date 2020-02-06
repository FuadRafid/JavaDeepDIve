package com.fuadrafid.wrapperclasses;

public class Methods {
    public static void main(String[] args) {
        // wrapper classes wrap primitive types of java.

        //parse and value of
        //parse -> returns primitive
        //valueOf -> returns wrapper class
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        int bad1 = Integer.parseInt("a"); // throws NumberFormatException
        Integer bad2 = Integer.valueOf("123.45");

        //Character class has no valueOf and parse

    }
}
