package com.fuadrafid.methodsandencapsulation.protectedaccess.birds;

public class Gosling extends Bird { // extends means create subclass
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}