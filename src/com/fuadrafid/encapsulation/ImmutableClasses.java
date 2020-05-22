package com.fuadrafid.encapsulation;

public class ImmutableClasses {
    public static void main(String[] args) {
        ImmutableSwan immutableSwan = new ImmutableSwan(10);
        //number of eggs is set to 10 and cannot be changed

        System.out.println("----Mutable Case----");
        StringBuilder someBuilder = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(someBuilder);
        someBuilder.append(" added");

        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");

        System.out.println("Class property: "+problem.getBuilder());
        System.out.println("Initial object: "+someBuilder);
        System.out.println("Return object from getter: "+ gotBuilder);

        /**The problem here is, there is only one object and the reference to this object is
         * being passed everywhere. So any change done to builder, sb or gotBuilder actually
         * changes the same object.

         sb -------------------------> |---------------|------------------------|
                                       |               | "initial added more"   |
         problem.builder ------------> | StringBuilder |                        |
                                       |               |      append()          |
         gotBuilder -----------------> |---------------|------------------------|

         The solution to this is actually creating new objects and passing them rather than
         passing around the reference.
         */

        System.out.println("----Immutable Case----");
        StringBuilder builder = new StringBuilder("initial");
        ActuallyImmutable actuallyImmutable = new ActuallyImmutable(builder);

        builder.append(" added");

        StringBuilder anotherGotBuilder = actuallyImmutable.getBuilder();
        anotherGotBuilder.append(" more");

        System.out.println("Class property: "+actuallyImmutable.getBuilder());
        System.out.println("Initial object: "+builder);
        System.out.println("Return object from getter: "+ anotherGotBuilder);



    }
}

class ImmutableSwan {
    private int numberEggs;

    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}

//When you are writing an immutable class, be careful about the return types.

class NotImmutable {
    private StringBuilder builder;
    public NotImmutable(StringBuilder b) {
        builder = b;
    }
    public StringBuilder getBuilder() {
        return builder;
    }
}

class ActuallyImmutable {
    private StringBuilder builder;
    public ActuallyImmutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }
    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }

    //another approach can be to return an immutable object i.e. String
    public String getValue() {
        return builder.toString();
    }

}

