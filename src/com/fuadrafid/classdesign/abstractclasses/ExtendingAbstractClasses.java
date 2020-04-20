package com.fuadrafid.classdesign.abstractclasses;

public class ExtendingAbstractClasses {
    public static void main(String[] args) {
//      new Animal(); -- DOES NOT COMPILE, cannot initiate an an abstract class
//      new Eagle()(); -- DOES NOT COMPILE, cannot initiate an an abstract class
        Lion lion = new Lion();
        System.out.println(lion.getName());
        lion.roar();
    }
}

abstract class Animal {
    public abstract String getName();
}

/**
 *! class Walrus extends Animal { } -- DOES NOT COMPILE
 *? Because the first concrete class that extends an abstract class
 *? must implement the abstract methods
*/

abstract class Eagle extends Animal {
} // no need to implement abstract methods when the child class is also abstract


abstract class BigCat extends Animal {
    public abstract void roar(); // no need to implement abstract methods when the child class is also abstract
}

class Lion extends BigCat {
    public String getName() {
        return "Lion";
    } // first concrete class of Animal, so must implement methods

    public void roar() {
        System.out.println("                .,  ,.                       ,.\n" +
                "              ,((')/))).                    (()\n" +
                "             '(.(()( )\")),                ((())\n" +
                "           \"___/,  \"/)))/).'               .))\n" +
                "           '.-.   \"(()(()()/^             ( (\n" +
                " >> ROAR << ' _)   /)()())(()'______.---._.' )\n" +
                "             '. _ _  (()(()))..            ,'\n" +
                "                   \\  ()) ())(             )\n" +
                "                   ((                .     /_\n" +
                "                   /       \\,     .-(     (_ )\n" +
                "                 .'   \\/    )___.'   \\      )\n" +
                "                /    \\-    /        _/'.-'  /\n" +
                "               (,(,.'     ))       (_ /    /\n" +
                "                  (,(,(,_)         (,(,(,_)");
        // first concrete class of BigCat, so must implement methods
    }
}
