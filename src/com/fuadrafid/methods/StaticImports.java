package com.fuadrafid.methods;

import java.util.List;
//import static java.util.Arrays; -- DOES NOT COMPILE, cannot static import classes, only members can be static imported
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; -- DOES NOT COMPILE. canot use * to import members
public class StaticImports {
    public static void main(String[] args) {
        List<String> list = asList("one", "two");
//        Arrays.asList("one"); -- DOES NOT COMPILE, because Arrays was not imported.
    }
}
