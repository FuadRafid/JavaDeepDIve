package com.fuadrafid.classdesign.polymorphism;

/**
 1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.

 2. Casting an object from a superclass to a subclass requires an explicit cast.

 3. The compiler will not allow casts to unrelated types.

 4. Even when the code compiles without issue, an exception may be thrown at runtime if
 the object being cast is not actually an instance of that class.
 */
public class CastingObjects {
    public static void main(String[] args) {
        Primate primate = new Lemur();
        /**
        *! Lemur lemur2 = primate; -- DOES NOT COMPILE
        *? Have to cast explicitly
        */
        Lemur lemur = (Lemur)primate;
        System.out.println(lemur.age);

        Fish fish = new Fish();
        /**
         *! Mammal Mammal = (Mammal)fish; -- DOES NOT COMPILE
         *? Because cannot cast to unrelated types.
         */

        Rodent rodent = new Rodent();
        Capybara capybara;
        try {
            capybara = (Capybara) rodent; // Throws ClassCastException at runtime
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }
        /**
         This happens because the rodent object is actually initiated as Rodent, and
         not instantiated as a Capybara. In short, if anything instantiated as a parent
         type cannot be cast to a child type, because it does not have the contents of the
         child class and thus are unrelated. But it can be avoided using instaceof operator
         */

        //comment last line of code to execute the lines below
        double random = Math.random();

        if(random > 0.5)
        {
            rodent = new Rodent();
        }
        else {
            rodent = new Capybara();
        }

        if(rodent instanceof Capybara) {
            capybara = (Capybara)rodent;
        }
        else
            capybara = new Capybara();

        System.out.print("Initialized Capybara object: ");
        capybara.getDetails();
    }
}

class Mammal {}
class Fish {}
class Rodent {
    public void getDetails(){
        System.out.println("I am Rodent");
    }
}
class Capybara extends Rodent {
    public void getDetails(){
        System.out.println("I am Capybara");
    }
}