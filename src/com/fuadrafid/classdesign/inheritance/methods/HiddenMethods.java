package com.fuadrafid.classdesign.inheritance.methods;

//A hidden method occurs when a child class defines a static method with the same name
//and signature as a static method defined in a parent class. Method hiding is similar but
//not exactly the same as method overriding

//1. The method in the child class must have the same signature as the method in the parent
//class.
//2. The method in the child class must be at least as accessible or more accessible than the
//method in the parent class.
//3. The method in the child class may not throw a checked exception that is new or
//broader than the class of any exception thrown in the parent class method.
//4. If the method returns a value, it must be the same or a subclass of the method in the
//parent class, known as covariant return types.
//5. The method defined in the child class must be marked as static if it is marked as
//static in the parent class (method hiding). Likewise, the method must not be marked
//as static in

public class HiddenMethods {
    public static void main(String[] args) {
        Panda.eat();
        Human human = new Human();
        human.getMammalDescription();// calls Mammal.getBiped(), because getBiped is static in Mammal and getMammalDescription was defined in Mammal
        human.getHumanDescription();// calls Human.getBiped(), because getHumanDescription calls getBiped from Human class.
        human.getParentDescription();// calls Mammal.getBiped() due to super call
    }
}

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}

class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
}


//In this example, sneeze() is marked as static in the parent class but not in the child
//class. The compiler detects that you’re trying to override a method that should be hidden
//and generates a compiler error. In the second method, hibernate() is an instance member
//in the parent class but a static method in the child class. In this scenario, the compiler
//thinks that you’re trying to hide a method that should be overridden and also generates a
//compiler error.

class RedPanda extends Bear {
//    public void sneeze() { // DOES NOT COMPILE
//        System.out.println("Panda bear sneezes quietly");
//    }
//    public static void hibernate() { // DOES NOT COMPILE
//        System.out.println("Panda bear is going to sleep");
//    }
}

//As you saw in the previous example, hiding static methods is fraught
//with pitfalls and potential problems and as a practice should be avoided.
//Though you might see questions on the exam that contain hidden static
//methods that are syntactically correct, avoid hiding static methods in your
//own work, since it tends to lead to confusing and difficult-to-read code.
//You should not reuse the name of a static method in your class if it is
//already used in the parent class.


//Important to remeber - static functions cannot be overridden, but can only be hidden. They can be accessed using Classname.functionName() even when hidden
class Mammal {
    public static boolean isBiped() {
        return false;
    }
    public void getMammalDescription() {
        System.out.println("Mammal walks on two legs: "+isBiped()); //although is biped is hidden in child Human, here Mammal.isBiped() will be called.
    }
}
class Human extends Mammal {
    public static boolean isBiped() { //this hides the parent function
        return true;
    }
    public void getHumanDescription() {
        System.out.println("Human walks on two legs: "+isBiped()); // this calls Human.isBiped()
    }
    public void getParentDescription() {
        System.out.println("Human walks on two legs: "+super.isBiped()); // this calls Human.isBiped()
    }

}