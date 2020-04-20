package com.fuadrafid.classdesign.interfaces.definition;

/**
The following is a list of rules for creating an interface:
1. Interfaces cannot be instantiated directly.

2. An interface is not required to have any methods.

3. An interface may not be marked as final .

4. All top-level interfaces are assumed to have public or default access, and they must
include the abstract modifier in their definition. Therefore, marking an interface as
private , protected , or final will trigger a compiler error, since this is incompatible
with these assumptions.

5. All non-default methods in an interface are assumed to have the modifiers abstract
and public in their definition. Therefore, marking a method as private , protected ,
or final will trigger compiler errors as these are incompatible with the abstract and
public keywords.
*/

public class InterfaceDefinition {
    public static void main(String[] args) {

    }
}

interface WalksOnTwoLegs {} // this is fine, it is not necessary to define functions always in an interface

/**
 *! final interface WalkOnFourLegs {} -- DOES NOT COMPILE
 *? Because an interface cannot be final, so that it can be implemented.
*/

//the compiler adds abstract and public before each interface definition
interface CanFly {
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}

//this and the above interface definition are both valid, the compiler adds abstract and publicc before each interface definition
abstract interface CanFlyAbstract {
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();
}

/**
*! private final interface CanCrawl {
 *? DOES NOT COMPILE, First, it is marked as final ,
 *? which cannot be applied to an interface since it conflicts
 *? with the assumed abstract keyword. Next, it is marked as private , which conflicts
 *? with the public or default required access for interfaces.
 *

 *!     private void dig(int depth);  -- DOES NOT COMPILE
 *? all interface methods are assumed to be public

 *!     protected abstract double depth(); -- DOES NOT COMPILE
 *? all interface methods are assumed to be public

 *!    public final void surface();  -- DOES NOT COMPILE
 *? marked as final and since interface methods are assumed to be
 *? abstract , the compiler throws an exception for using both abstract and final keywords
 *? on a method.
*! }
*/
