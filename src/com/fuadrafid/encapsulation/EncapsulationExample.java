package com.fuadrafid.encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Swan swan = new Swan();
        //swan.numberEggs// cannot access because private
        swan.setNumberEggs(-1); // will not work because guarded
        System.out.println(swan.getNumberEggs());
        swan.setNumberEggs(10);
        System.out.println(swan.getNumberEggs());
    }
}

class Swan {
    private int numberEggs; // mutator method, private

    public int getNumberEggs() { // accessor method, getter
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) { // setter
        if (numberEggs >= 0) // guard condition
            this.numberEggs = numberEggs;
    }
}