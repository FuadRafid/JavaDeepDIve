package com.fuadrafid.corejavaapis.arrays;

public class Creation {
    public static void main(String[] args) {
        int[] numbers1 = new int[3]; // basic initialization
        int[] numbers2 = new int[] {42, 55, 99}; // initialize with values
        int[] numbers3 = {42, 55, 99}; // remove redundant new

        //different ways of initialization, space doesn't matter
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];

        //Multiple arrays declaration
        int[] ids, types; // both of type int[]
        int ids2[], types2; // ids2 of type int[] and types2 of type int

        //Initialize with referencing
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); //
        System.out.println(alias.toString()); //

        // equals matches reference, not content
        String[] againBugs = {"cricket", "beetle", "ladybug"};
        System.out.println(againBugs.equals(bugs));
        System.out.println(againBugs.toString());


        // if you cast to parent, you still cannot add other children type.
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE, because casted to String[]
        objects[0] = new StringBuilder(); // careful! you cannot use StringBuilder functions.
    }
}
