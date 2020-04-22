package com.fuadrafid.classdesign.polymorphism;


/**
 1. The type of the object determines which properties exist within the object in memory.

 2. The type of the reference to the object determines which methods and variables are
 accessible to the Java program.
 */

public class ObjectVsReference {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        //By initializing means someClass has the properties defined in SomeClass class

        Object someClassAsObject = someClass;
        //But when we cast to object, we can only access what is available in the object class
        /**
        *! someClassAsObject.someValue; -- DOES NOT COMPILE
        *! someClassAsObject.someFunction(); -- DOES NOT COMPILE
        *? the type of someClassAsObject is Object, so only functions and variables of Object
        *? can be accessed
        */
    }
}

class SomeClass{
    public int someValue = 10;
    public int someFunction(){
        return someValue;
    }
}
