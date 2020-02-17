package com.fuadrafid.methodsandencapsulation.protectedaccess.notbird;


import com.fuadrafid.methodsandencapsulation.protectedaccess.inhertiedbirds.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        //goose.floatInWater(); // DOES NOT COMPILE, because floatInWater is in Bird, GooseWatcher is in different package and also does not extend Bird
    }
}