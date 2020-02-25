package com.fuadrafid.methods;

public class ReferenceTypes {
    public void fly(String s) {
        System.out.print("string ");
    }
    public void fly(Object o) {
        System.out.print("object ");
    }
    public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }
    public void longTest(long l){ System.out.print("long ");}
    public void intTest(int l){ System.out.print("long ");}

    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");// calls fly(String o)
        r.fly(56); // calls fly(Object o)

        //Note that Java can only accept wider types. An int can be passed to a method taking a
        //long parameter. Java will not automatically convert to a narrower type. If you want to pass
        //a long to a method taking an int parameter, you have to add a cast to explicitly say narrowing
        //is okay.
        r.longTest(12); //long can be called with int
        r.intTest(12L); // int cannot be called with long
        r.intTest((int)12L); // but casting can be done to call with int

        r.fly(123); // calls by int
        r.fly(123L); // calls by long


    } }