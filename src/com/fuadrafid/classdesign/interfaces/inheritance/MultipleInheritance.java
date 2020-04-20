package com.fuadrafid.classdesign.interfaces.inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.eatMeat();
        bear.eatMeat();
    }
}

interface Herbivore {
    public void eatPlants();
}
interface Omnivore {
    public void eatPlants();
    public void eatMeat();
}

class Bear implements Herbivore, Omnivore {
    public void eatMeat() {
        System.out.println("Eating meat");
    }
    public void eatPlants() {
        System.out.println("Eating plants"); // this fulfills both interfaces
    }
}

/** What if two methods from two interfaces have same name but different signatures? */

interface HerbivoreAgain {
    public int eatPlants();
}
interface OmnivoreAgain {
    public void eatPlants();
}
/**
 *! interface Supervore extends HerbivoreAgain, OmnivoreAgain {}  -- // DOES NOT COMPILE
 *? Because eatPlants has different signatures in the two interfaces
 */

/**
 *! public abstract class AbstractBear implements HerbivoreAgain, OmnivoreAgain {}  -- // DOES NOT COMPILE
 *? Because eatPlants has different signatures in the two interfaces
 */

/** Even without implementation details, the compiler detects the problem with the
abstract definition and prevents compilation. **/