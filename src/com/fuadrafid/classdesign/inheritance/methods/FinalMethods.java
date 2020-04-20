package com.fuadrafid.classdesign.inheritance.methods;


//You cannot hide or override a final method
public class FinalMethods {
    public static void main(String[] args) {

    }
}

class Bird {
    public final boolean hasFeathers() {
        return true;
    }
    public static final boolean hasBeak(){
        return true;
    }
}
class Penguin extends Bird {
//    public final boolean hasFeathers() { -- DOES NOT COMPILE, because hasFeathers is final in parent and cannot be overridden
//        return false;
//    }
//
//    public static final boolean hasBeak(){ -- DOES NOT COMPILE, because hasBeak is final in parent and cannot be hidden
//        return true;
//    }
}

/*
Although marking methods as final prevents them from being overridden, it does have
advantages in practice. For example, you’d mark a method as final when you’re defi ning
a parent class and want to guarantee certain behavior of a method in the parent class,
regardless of which child is invoking the method.
For example, in the previous example with Birds, the author of the parent class may want
to ensure the method hasFeathers() always returns true, regardless of the child class
instance on which it is invoked. The author is confident that there is no example of a Bird in
which feathers are not present.
The reason methods are not commonly marked as final in practice, though, is that it
may be difficult for the author of a parent class method to consider all of the possible
ways her child class may be used. For example, although all adult birds have feathers, a
baby chick doesn't; therefore, if you have an instance of a Bird that is a chick, it would
not have feathers. In short, the final modifier is only used on methods when the author
of the parent method wants to guarantee very precise behavior.
*/