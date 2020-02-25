package com.fuadrafid.methods;

public class ReturnType {

    public void walk1() { }
    public void walk2() { return; }
    public String walk3() { return ""; }
    public String walk4() { } // DOES NOT COMPILE, not returning a String
    public walk5() { } // DOES NOT COMPILE, no return type
    String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE, returns nothing if condition no met.

    int integer() {
        return 9;
    }

    int longFunc() {
        return 9L; // DOES NOT COMPILE, because cannot stuff long in an int
    }

    int integerExpanded() {
        int temp = 9;
        return temp;
    }

    int longExpanded() {
        int temp = 9L; // DOES NOT COMPILE, because cannot stuff long in an int
        return temp;
    }

}
