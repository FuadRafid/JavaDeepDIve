package com.fuadrafid.methods.constructors;

public class OverloadingConstructors {
    private String color;
    private int weight;
    public OverloadingConstructors(int weight) { // first constructor
        this.weight = weight;
        color = "brown";

        //this() has one special rule. If you choose to call it, the this() call
        //must be the first noncommented statement in the constructor.
        //this(weight,"brown"); -- DOES NOT COMPILE


    }
    public OverloadingConstructors(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }

    public OverloadingConstructors(String color) { // second constructor
        //you can use the other constructor with parameters
        this(10,color);
    }


}
