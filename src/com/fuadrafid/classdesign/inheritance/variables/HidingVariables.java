package com.fuadrafid.classdesign.inheritance.variables;

public class HidingVariables {
    public static void main(String[] args) {

    }
}


/**
As when hiding a static method, you can’t override a variable; you can only hide it. Also
similar to hiding a static method, the rules for accessing the parent and child variables are
quite similar. If you’re referencing the variable from within the parent class, the variable
defined in the parent class is used. Alternatively, if you’re referencing the variable from
within a child class, the variable defined in the child class is used. Likewise, you can reference
the parent value of the variable with an explicit use of the super keyword
*/
class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
class Mouse extends Rodent {
    protected int tailLength = 8;
    public void getMouseDetails() {
       System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]"); //Notice that the instance of Mouse contains two copies of the tailLength variables: one defined in the parent and one defined in the child.
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
}
