package com.fuadrafid.classdesign.constructors;

public class CallingConstructors {
    public static void main(String[] args) {
        new Chimpanzee();
    }
}

class Primate {
    public Primate() {
        //compiler first adds a super call, then the sout
        System.out.println("Primate");
    }
}
class Ape extends Primate {
    public Ape() {
        //compiler first adds a super call, then the sout
        System.out.println("Ape");
    }
}
class Chimpanzee extends Ape {
    //compiler inserts a default constructor, and a super() call
}