package com.fuadrafid.classdesign.interfaces;

/**
 1. Interface variables are assumed to be public , static , and final . Therefore, marking
 a variable as private or protected will trigger a compiler error, as will marking any
 variable as abstract.

 2. The value of an interface variable must be set when it is declared since it is marked as final.
*/

public class InterfaceVariables {
}


interface CanSwim {
    int MAXIMUM_DEPTH = 100; // Compiler adds public static final automatically
    /** int MINIMUM_DEPTH; */ // must define the variable as it is assumed to be final
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}

// Similar to the previous interface
interface CanSwimAgain {
    public static final int MAXIMUM_DEPTH = 100;
    public static final boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}


interface CanDig {
    /**
     *! private int MAXIMUM_DEPTH = 100; -- DOES NOT COMPILE
     *! protected abstract boolean UNDERWATER = false; -- DOES NOT COMPILE
     *? interface variables are assumed as public, so cannot use private or protected

     *! public static String TYPE; -- DOES NOT COMPILE
     *? interface variables are final and thus must be initialized when declared
     */
}

