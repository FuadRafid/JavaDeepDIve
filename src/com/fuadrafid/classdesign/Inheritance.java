package com.fuadrafid.classdesign;

public class Inheritance {
    public static void main(String[] args) {
        new Zebra();
        new Gorilla();
    }
}


class Animal {
    private int age;
    private String name;
    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}

class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // calls constructor of superclass Animal
    }
    public Zebra() {
        this(4); // calls constructor of superclass Animal
    }
}

//If the parent class has more than one constructor, the child class may use any valid
//parent constructor in its definition

class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age,"Gorilla");
    }
    public Gorilla() {
        super(5);
    }
}