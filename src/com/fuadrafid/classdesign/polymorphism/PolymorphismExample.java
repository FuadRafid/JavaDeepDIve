package com.fuadrafid.classdesign.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println("Lemur age: "+lemur.age);

        HasTail hasTail = lemur;
        System.out.println("Lemur as HasTail interface: isTailStriped()-> "+hasTail.isTailStriped());

        /**
        *! System.out.println("Lemur age: "+hasTail.age); -- DOES NOT COMPILE
        *? Once the object has been assigned a new reference type, only the methods and variables
        *? available to that reference type are callable on the object, unless an explicit cast
        */
        System.out.println("Lemur age: "+((Lemur)hasTail).age);
        //this will compile, because of explicit casting

        Primate primate = lemur;
        System.out.println("Lemur as Primate class: hasHair() -> "+ primate.hasHair());

        /**
         *! System.out.println(primate.isTailStriped()); -- DOES NOT COMPILE
         *? Once the object has been assigned a new reference type, only the methods and variables
         *? available to that reference type are callable on the object, unless an explicit cast
         */

        System.out.println("Lemur tail striped: "+((Lemur)primate).isTailStriped());
        //this will compile, because of explicit casting
    }
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public int age = 10;

    public boolean isTailStriped() {
        return false;
    }
}

/**
 Once the object has been assigned a new reference type, only the methods and variables
 available to that reference type are callable on the object without an explicit cast
*/

/**

 *? Contents of main function visualized

 *? Reference of interface HasTail
  ______________________
 |           |         |
 |  hasTail  |      ---|----------------------*
 |___________|_________|                      |
                                              V
 *? Reference of class Lemur               Lemur object in memory
  ______________________                   ______________________
 |           |         |                  |   age     |   10    |
 |  lemur    |      ---|----------------->|---------------------|
 |___________|_________|                  | hasHair()           |
                                          | isTailStripped()    |
                                          |_____________________|
 /**                                           ^
 *? Reference of class Primate *//**           |
 ______________________                        |
 |           |         |                       |
 |  primate  |      ---|-----------------------*
 |___________|_________|
*/