package com.fuadrafid.classdesign.abstractclasses;

public class Example {
    public static void main(String[] args) {
        new Swan();
    }
}

abstract class Bird {
    protected int age;
    public void eat() {
        System.out.println("Bird is eating");
    }
    public abstract String getName();
}

class Swan extends Bird {
    public String getName() {
        return "Swan";
    }
}
