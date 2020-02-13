package com.fuadrafid.corejavaapis.string;

public class StringPool {
    public static void main(String[] args) {
        //String pool in java stores all string literals (in this case "Fluffy") and allows them for reuse.
        String name = "Fluffy"; // this says to use the string pool normally
        String sameName = "Fluffy";// this also says to use the string pool normally
        System.out.println(name == sameName); // String pool assigns the same string to both name and sameName
        System.out.println("Hashcode for name: " + name.hashCode()+". Hashcode for sameName: " + sameName.hashCode());// they have the same hashcode

        //Using String without the string pool
        String newName = new String("Fluffy"); // this says to ignore the string pool and create a new String object
        System.out.println(name == newName); // they have different reference
        System.out.println(name.equals(newName)); // equals matches value, so this will be true.
    }
}
