package com.fuadrafid.methodsandencapsulation;

public class Varags {
    public void walk1(int... nums) { }
    public int walk2(int start, int... nums) {
        return nums.length;
    }
//    public void walk3(int... nums, int start) { } // DOES NOT COMPILE
//    public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

    public static void main(String[] args) {
        System.out.println(new Varags().walk2(0, 1,2,3));
        new Varags().walk2(0, null); // will throw NullPointerException
    }
}
