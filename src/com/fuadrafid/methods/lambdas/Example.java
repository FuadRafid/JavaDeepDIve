package com.fuadrafid.methods.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        System.out.println("Animals that can hop");
        TraditionalSearch.print(animals, new CheckIfHopper()); // pass class that does check

        /** Now what happens if we want to print the Animals that swim? We need to write
         another class CheckIfSwims. Or we can use lambdas */

        System.out.println("Animals that can hop");
        TraditionalSearch.print(animals, a -> a.canHop());

        System.out.println("Animals that can swim");
        TraditionalSearch.print(animals, a -> a.canSwim());

        //How about Animals that cannot swim?

        System.out.println("Animals that cannot swim");
        TraditionalSearch.print(animals, a -> !a.canSwim());

        System.out.println("Animals that cannot swim");

        //More verbose lambda
        TraditionalSearch.print(animals,(Animal a) -> { return a.canHop(); });

    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

/** Lambdas work with interfaces that have only one method. These are called functional
interfaces */
interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}


class TraditionalSearch {
    public static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}