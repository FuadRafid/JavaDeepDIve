package com.fuadrafid.classdesign.inheritance.methods;


//Rules of method overriding
//1. The method in the child class must have the same signature as the method in the parent
//class.
//2. The method in the child class must be at least as accessible or more accessible than the
//method in the parent class.
//3. The method in the child class may not throw a checked exception that is new or
//broader than the class of any exception thrown in the parent class method.
//4. If the method returns a value, it must be the same or a subclass of the method in the
//parent class, known as covariant return types.

public class MethodOverriding {
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription(); // returns true, because overridden, even when getMarsupialDescription has been defined in parent
        joey.getKangarooDescription();
        joey.getParentDescription();// in this case, the call is for super.isBiped. So it calls the parent not the overridden child.

        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
        System.out.println(new Dog().getAverageWeight()); // causes java.lang.StackOverflowError, because of infinite loop in recursion


    }
}

class Canine {
    public double getAverageWeight() {
        return 50;
    }
}

class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }
}

class Dog extends Canine {
    public double getAverageWeight() {
        return getAverageWeight() + 20; //infinite loop due to recursion and causes java.lang.StackOverflowError

    }
}


class InsufficientDataException extends Exception {
}

class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
        return 2;
    }

    protected double getHeight() throws InsufficientDataException {
        return 2;
    }

    protected int getLength() {
        return 10;
    }
}

class Snake extends Reptile {
    protected boolean hasLegs() { //child class can remove the exception in parent class
        return false;
    }

    protected double getWeight() throws InsufficientDataException { // child class can throw child exception of exception thrown in parent class
        return 2;
    }
}

//class Lizard extends Reptile {
//    protected double getHeight() throws Exception { // DOES NOT COMPILE, because Exception is broader than InsufficientDataException
//        return 2;
//    }
//
//    protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE, because parent does not throw any exception
//        return 10;
//    }
//}

class Marsupial {
    public boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped()); // isBiped is overridden in Kangaroo, so isBiped will return true, though the call is from parent
    }
}
class Kangaroo extends Marsupial {
    public boolean isBiped() { //overrides the parent method
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public void getParentDescription() {
        System.out.println("Kangaroo hops on two legs: "+super.isBiped()); // here, the call is for parent isBiped, which return false.
    }
}
