package com.fuadrafid.classdesign.interfaces;

public class InterfaceDefinition {
    public static void main(String[] args) {

    }
}

interface WalksOnTwoLegs {} // this is fine, it is not necessary to define functions always in an interface

//final interface WalkOnFourLegs {} //WILL NOT COMPILE, because an interface cannot be final, so that it can be implemented.


//the compiler adds abstract before each interface definition
interface CanFly {
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}

//this and the above interface definition are both valid, the compiler adds abstract before each interface definition
abstract interface CanFlyAbstract {
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();
}