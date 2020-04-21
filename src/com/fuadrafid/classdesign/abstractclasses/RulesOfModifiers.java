package com.fuadrafid.classdesign.abstractclasses;

public class RulesOfModifiers {
    public static void main(String[] args) {
        new SpermWhale().sing();
    }
}


/**
An abstract method may not be marked as final for the same reason that
an abstract class may not be marked as final. Once marked as final, the method can
never be overridden in a subclass, making it impossible to create a concrete instance of the
abstract class.
*/

abstract class Goat {
    /**
    *! abstract final void chew(); -- DOES NOT COMPILE
    */
}

/**
 A method may not be marked as both abstract and private,
 because the child cannot inherit and redefine the function
*/
abstract class Whale {
    protected abstract void sing();
}
class SpermWhale extends Whale{

    @Override
    protected void sing() {
        System.out.println("        .\n" +
                "       \":\"\n" +
                "     ___:____     |\"\\/\"|\n" +
                "   ,'        `.    \\  /\n" +
                "   |  O        \\___/  |\n" +
                " ~^~^~^~^~^~^~^~^~^~^~^~^~");
    }
}


/** for overriding a method, the subclass cannot reduce the visibility of the parent method,
sing(). Because the method is declared protected in the parent class, it must be marked
as protected or public in the child class. Even with abstract methods, the rules for
overriding methods must be followed.
 */

abstract class HumpbackWhale extends Whale {
    /**
    *! private void sing() {
    *!   System.out.println("Humpback whale is singing");  -- DOES NOT COMPILE
    *! }
    *? because access is public in parent and private here */
}
