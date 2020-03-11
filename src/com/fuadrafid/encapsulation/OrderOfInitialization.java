package com.fuadrafid.encapsulation;

class MotherClass{
    public MotherClass(){
        System.out.println("MotherClass");
    }
}

class ChildClass extends MotherClass{
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public ChildClass(){
        System.out.println("ChildClass");
    }

}
public class OrderOfInitialization {

    //1. If there is a superclass, initialize it first
    //2. Static variable declarations and static initializers in the order they appear in the file.
    //3. Instance variable declarations and instance initializers in the order they appear in the file.
    //4. The constructor.


    public static void main(String[] args) {
        new ChildClass();
    }
}
