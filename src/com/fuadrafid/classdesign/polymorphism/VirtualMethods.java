package com.fuadrafid.classdesign.polymorphism;

/**
 A virtual method is a method in which the specific implementation is not determined until runtime.
 In fact, all non-final, non-static, and non-private Java methods are considered virtual methods,
 since any of them can be overridden at runtime.
 */
public class VirtualMethods {
    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();
        /**
        The Bird object (bird) has no idea in compile time that the instance is
        of Peacock, it only knows when it executes displayInformation() at runtime.
        In other words, even though the parent class Bird defines its own version
        of getName() and doesn’t know anything about the Peacock class during
        compile-time, at runtime the instance uses the overridden version of the
        method, as defined on the instance of the object. This characteristic of Java
        is used heavily in implementing interfaces and initializing an interface type
        as a concrete service class. E.g.:
        */
        SomeServiceInterface someService;
        double random = Math.random();

        if(random > 0.5)
        {
            someService = new SomeService();
        }
        else {
            someService = new SomeOtherService();
        }

        System.out.println(someService.someAction());

        /**
        Here, the SomeServiceInterface type object (someService) is initiated in runtime, hence
        it cannot know in compile time what implementation of someAction() will be called in
        compile time, making it a virtual function.
        */

    }
}


class Bird {
    public String getName() {
        return "Unknown";
    }
    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
}
class Peacock extends Bird {
    public String getName() {
        return "Peacock";
    }
}

interface SomeServiceInterface{
    String someAction();
}

class SomeService implements SomeServiceInterface{

    @Override
    public String someAction() {
        return "Doing some work";
    }
}

class SomeOtherService implements SomeServiceInterface{

    @Override
    public String someAction() {
        return "Doing some other work";
    }
}

