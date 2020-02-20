package com.fuadrafid.methodsandencapsulation.staticmodifier;

public class NullTest {
    public static void main(String[] args) {

        Koala k = new Koala();
        System.out.println(k.count); // k is a Koala
        k = null;
        System.out.println(k.count); // k is still a Koala, no NullPointerException

        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5; // same variable changed 3 times
        System.out.println(Koala.count);

    }
}
