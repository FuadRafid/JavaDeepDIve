package com.fuadrafid.classdesign.interfaces.inheritance;

/**
There are two inheritance rules you should keep in mind when extending an interface:
1. An interface that extends another interface, as well as an abstract class that
implements an interface, inherits all of the abstract methods as its own abstract
methods.
2. The first concrete class that implements an interface, or extends an abstract class
that implements an interface, must provide an implementation for all of the inherited
abstract methods.
 */

public class InterfaceInheritance {
    public static void main(String[] args) {

    }
}

interface HasTail {
    public int getTailLength();
}
interface HasWhiskers {
    public int getNumberOfWhiskers();
}

interface Seal extends HasTail, HasWhiskers {
}

//Any class that implements the Seal interface must provide an implementation for all methods
//in the parent interfaces—in this case, getTailLength() and getNumberOfWhiskers() .

//An abstract class that implements interfaces does not need to implement the interface functions
abstract class HarborSeal implements HasTail, HasWhiskers {
}

/**
 *! class LeopardSeal implements HasTail, HasWhiskers { }
 *? DOES NOT COMPILE, the first concrete class to implement must interface
 *? must define the abstract functions
 */


/** Important note for OCA Exam -
  Only connection between a class and an interface is with the syntax
  *? class implements interface
*/

interface CanRun {}

/**
 *! class Cheetah extends CanRun {} -- DOES NOT COMPILE
 *? A class cannot inherit an interface
*/

class Hyena {}

/**
 *! interface HasFur extends Hyena {} -- DOES NOT COMPILE
 *? An interface cannot inherit a class
 */

