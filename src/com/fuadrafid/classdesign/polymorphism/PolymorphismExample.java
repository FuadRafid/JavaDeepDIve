package com.fuadrafid.classdesign.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println("Lemur age: "+lemur.age);

        HasTail hasTail = lemur;
        System.out.println("Lemur as HasTail interface: isTailStriped()-> "+hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println("Lemur as Primate class: hasHair() -> "+ primate.hasHair());
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