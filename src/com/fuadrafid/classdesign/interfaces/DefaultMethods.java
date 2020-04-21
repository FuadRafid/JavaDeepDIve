package com.fuadrafid.classdesign.interfaces;

/**
 A default method within an interface defines an abstract method with a default implementation.
 In this manner, classes have the option to override the default method if they
 need to, but they are not required to do so. If the class doesn’t override the method, the
 default implementation will be used. In this manner, the method definition is concrete, not
 abstract.

 1. A default method may only be declared within an interface and not within a class or
 abstract class.

 2. A default method must be marked with the default keyword. If a method is marked as
 default , it must provide a method body.

 3. A default method is not assumed to be static , final , or abstract , as it may be used
 or overridden by a class that implements the interface.

 4. Like all methods in an interface, a default method is assumed to be public and will not
 compile if marked as private or protected .
 */

public class DefaultMethods {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("Temperature of Human is: "+human.getTemperature());
    }
}


interface IsWarmBlooded {
    boolean hasScales();
    public default double getTemperature() {
        return 90.0;
    }
}
class Human implements IsWarmBlooded{

    @Override
    public boolean hasScales() {
        return false;
    }
}

interface Carnivore {
    /**
     *! public default void eatMeat(); -- DOES NOT COMPILE
     *? default method must have a body
     */
    /**
    *!  public int getRequiredFoodAmount() { -- DOES NOT COMPILE
    *!     return 13;
    *! }
    *? an interface method with a body must be marked as default
     */
}

/**
 The purpose of adding default methods to the Java language was in part to help with
 code development and backward compatibility. Imagine you have an interface that is
 shared among dozens or even hundreds of users that you would like to add a new method
 to. If you just update the interface with the new method, the implementation would break
 among all of your subscribers, who would then be forced to update their code. In practice,
 this might even discourage you from making the change altogether. By providing a default
 implementation of the method, though, the interface becomes backward compatible with
 the existing codebase, while still providing those individuals who do want to use the new
 method with the option to override it
 */

interface HasFins {
    public default  int getNumberOfFins(){
        return 4;
    }
    public default double getLongestFinLength(){
        return 20.0;
    }
    public default boolean doFinsHaveScales(){
        return true;
    }

}
interface SharkFamily extends HasFins {
    public default int getNumberOfFins() { //overridden to return a new value
        return 8;
    }
    public double getLongestFinLength(); //replaces default method with an abstract method

    /**
     *!  public int doFinsHaveScales() { -- DOES NOT COMPILE
     *!     return false;
     *! }
     *? an interface method with a body must be marked as default
     */
}

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}
interface Run {
    public default int getSpeed() {
        return 5;
    }
}

/**
*! class Cat implements Walk, Run { -- DOES NOT COMPILE
*!     public static void main(String[] args) {
*!         System.out.println(new Cat().getSpeed());
*!     }
*? Interfaces Walk and Run both have methods named getSpeed with same signature
}
*/

/** If the function is overridden however, it becomes valid*/
class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}

/**
*! abstract class Mammals implements Walk,Run { -- DOES NOT COMPILE
 *!  public int WalkFaster() {
 *!     return getSpeed() * 2;
 *! }
 *! }
*? the default method could be called in a concrete method within the abstract class
*? so, there must be an implementation of the default method with same signature in Walk and Run
*/