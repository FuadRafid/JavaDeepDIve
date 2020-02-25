package com.fuadrafid.methodsandencapsulation.staticmodifier;

public class Gorilla {

    public static int count;


    public static void addGorilla() {
        count++;
    }


    public void babyGorilla() {
        count++;
    }


    public void announceBabies() {
        addGorilla();
        babyGorilla();
        }


    public static void announceBabiesToEveryone() {
        addGorilla();
       babyGorilla(); // DOES NOT COMPILE, cannot access non-static function from static function
        }

    public int total;
    public static int average = total / count; // DOES NOT COMPILE, cannot use non-static variable to assign to a static variable
 }