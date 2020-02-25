package com.fuadrafid.methodsandencapsulation;

public class OverloadingMethods {
    //valid overloading ONLY when parameters are changed
    public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }
    //Using a different return type and same method signature is not valid, because they have the same signature
   public int fly(int numMiles) { } // DOES NOT COMPILE, because not a valid overload.
}
