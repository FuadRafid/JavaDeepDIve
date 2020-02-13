package com.fuadrafid.corejavaapis.stringbuilder;

public class Mutability {
    public static void main(String[] args) {

        //Initialization
        StringBuilder sb1 = new StringBuilder(); // initialize with default capacity
        StringBuilder sb2 = new StringBuilder("animal"); //initialize with value
        StringBuilder sb3 = new StringBuilder(10); // initialize with parameterized capacity

        //StringBuilder class is mutable
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // this appends sb and also returns a new StringBuilder, this allows for chaining
        System.out.println("sb: "+sb); // sb was changed when sb.append was called.
        System.out.println("same: "+same); // sb and name have the same value, as StringBuilder is immutable

        //Chaining
        StringBuilder chain = new StringBuilder("start");
        StringBuilder chainReturn = chain.append("+middle").append("+end");
        System.out.println("chain: "+chain); // sb was changed when sb.append was called.
        System.out.println("chainReturn: "+chainReturn); // sb and name have the same value, as StringBuilder is immutable



    }
}
