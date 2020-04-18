package com.fuadrafid.methods;

public class AutoBoxing {
    public static void fly(int numMiles) {
    }

    public static void fly(Integer numMiles) {
    }

    public static void main(String[] args) {
        fly(3);// calls fly with int, not Integer parameter
        fly(new Integer(3)); // calls fly with Integer
    }
}
