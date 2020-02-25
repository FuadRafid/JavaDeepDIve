package com.fuadrafid.methods;

public class MethodDataPassing {
    //Java passes parameters by value
    public static void main(String[] args) {
        int num = 4;
        newNumber(5);
        System.out.println(num); // 4

        String nameString = "Webby";
        speak(nameString);
        System.out.println(nameString); // Sparky

        StringBuilder nameBuilder = new StringBuilder();
        speak(nameBuilder);
        System.out.println(nameBuilder); // Webby, beacuse

        int number = 1; // 1
        String letters = "abc"; // abc
        number(number); // 1, because return value is not used.
        letters = letters(letters); // abcd
        System.out.println(number + letters); // 1abcd
    }

    public static void newNumber(int num) {
        num = 8;
    }

    public static void speak(String name) {
        name = "Sparky";
    }

    public static void speak(StringBuilder s) {
        s.append("Webby");
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }

}
