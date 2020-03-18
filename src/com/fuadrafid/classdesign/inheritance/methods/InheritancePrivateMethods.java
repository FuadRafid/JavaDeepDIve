package com.fuadrafid.classdesign.inheritance.methods;

//Java permits you to redeclare a new method in the child class with the same or modifi
//ed signature as the method in the parent class. This method in the child class is a separate
//and independent method, unrelated to the parent version’s method, so none of the rules for
//overriding methods are invoked.

public class InheritancePrivateMethods {
    public static void main(String[] args) {
        new BactrianCamel().getNumberOfHumps();
    }
}

class Camel {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}

class BactrianCamel extends Camel {
    public int getNumberOfHumps() { // this is not an overridden method, this is a new method with a new signature. So, the parent method is "hidden"
        return 2;
    }
}
