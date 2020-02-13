package com.fuadrafid.corejavaapis.string;

public class Immutability {
    public static void main(String[] args) {
        // String in java cannot be changed once initiated. This is called immutability.
        String test = "some text";
        String concatTest = test.concat(" another text");// concat cannot change test as test is immutable, so it creates a new string and returns it.
        System.out.println(test); // no change to test, because test is immutable and cannot be changed
        System.out.println(concatTest); //concatTest was created when test.concat was called

    }
}
