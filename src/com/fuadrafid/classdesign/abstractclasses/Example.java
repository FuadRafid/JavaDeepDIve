package com.fuadrafid.classdesign.abstractclasses;

public class Example {
    public static void main(String[] args) {
        new Swan();
    }
}

abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}

class Swan extends Animal {
    public String getName() {
        return "Swan";
    }
}
