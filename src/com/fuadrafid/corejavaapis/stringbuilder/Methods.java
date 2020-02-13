package com.fuadrafid.corejavaapis.stringbuilder;

public class Methods {
    public static void main(String[] args) {
        //Important to notice - substring returns string
        StringBuilder example = new StringBuilder("example");
        String substring = example.substring(1, 5);
        System.out.println(substring);
    }
}
