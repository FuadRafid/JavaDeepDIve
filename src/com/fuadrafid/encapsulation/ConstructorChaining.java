package com.fuadrafid.encapsulation;


public class ConstructorChaining {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    //Overloaded constructors often call each other. One common technique is to have each
    //constructor add one parameter until getting to the constructor that does all the work.
    //This approach is called constructor chaining. In this example, all three constructors are
    //chained.
    public ConstructorChaining(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }
    public ConstructorChaining(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }
    public ConstructorChaining(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }
    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }
    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining(15);
        constructorChaining.print();
    }
}
