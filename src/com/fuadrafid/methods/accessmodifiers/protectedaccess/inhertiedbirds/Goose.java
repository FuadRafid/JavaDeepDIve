package com.fuadrafid.methods.accessmodifiers.protectedaccess.inhertiedbirds;

import com.fuadrafid.methods.accessmodifiers.protectedaccess.birds.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater(); // DOES NOT COMPILE,
//        System.out.println(other.text); // DOES NOT COMPILE
    }
}