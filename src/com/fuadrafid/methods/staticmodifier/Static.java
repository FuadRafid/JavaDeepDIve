package com.fuadrafid.methods.staticmodifier;

public class Static {
    private String name = "Static class";
    private static String otherName = "Static name";

    public void first() {
        System.out.println(otherName); // can access static field from non static function
        third(); // can access static function from non static function
    }

    public static void second() {
       //System.out.println(name); // cannot access non static fields from static function
    }

    public void third() {
        System.out.println(name);
    }

    public static void main(String args[]) {
        //first();// cannot call non static function from static context
        second();
        //third(); -- DOES NOT COMPILE, cannot call non static function from static function
    }
}