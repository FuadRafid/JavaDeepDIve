package com.fuadrafid.methods.lambdas;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * As lambdas can only be used with functional interfaces, each time we need to use a lambda,
 * we need to a declare an interface each time. Luckily we don't have to because Java has provided
 * it for us with the Predicate class:
 * <p>
 * public interface Predicate<T> {
 * boolean test(T t);
 * }
 */
public class Predicates {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        print(animals, a -> a.canHop());

        /**
         Java 8 even integrated the Predicate interface into some existing classes. There is only
         one you need to know for the exam. ArrayList declares a removeIf() method that takes a
         Predicate.
         */

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies); // [hoppy]
    }

    private static void print(List<Animal> animals, Predicate<Animal> //say which type here
            checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
