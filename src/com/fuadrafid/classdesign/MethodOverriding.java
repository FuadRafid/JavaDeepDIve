package com.fuadrafid.classdesign;

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
        System.out.println(new Dog().getAverageWeight()); // causes java.lang.StackOverflowError

    }
}

class Canine {
    public double getAverageWeight() {
        return 50;
    }
}
class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }
}

class Dog extends Canine {
    public double getAverageWeight() {
        return getAverageWeight()+20; //infinite loop due to recursion and causes java.lang.StackOverflowError

    }
}
