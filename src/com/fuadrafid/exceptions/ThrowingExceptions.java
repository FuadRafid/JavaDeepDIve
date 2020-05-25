package com.fuadrafid.exceptions;


/**
 Exceptions can be thrown in two ways.
 1. By the system.
 2. Explicitly requesting Java to throw one.
 */

/**
 |--------------------------------------------------------------------------------------------------------------
 |        Type                   How to recognize             Okay for program             Is program required
 |                                                               to catch?                to handle or declare?
 |--------------------------------------------------------------------------------------------------------------
 | Runtime Exception          Subclass of RuntimeException         Yes                           No
 |
 |
 | Checked exception          Subclass of Exception but not        Yes                           Yes
 |   (Exception)              subclass of RuntimeException
 |
 |      Error                    Subclass of Error                 No                            No
 |---------------------------------------------------------------------------------------------------------------
 * */
public class ThrowingExceptions {
    public static void main(String[] args) throws Exception {


        String[] animals = new String[0];
        System.out.println(animals[0]); // the system will throw ArrayOutOfBoundsException

        throw new Exception(); // explicit request

        /**
         * More example of explicit requests:
         *
         throw new Exception("Ow! I fell.");
         throw new RuntimeException();
         throw new RuntimeException("Ow! I fell.");
         */
    }
}
