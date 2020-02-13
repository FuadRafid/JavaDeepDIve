package com.fuadrafid.methodsandencapsulation.defaultaccess.notduck;

import com.fuadrafid.methodsandencapsulation.defaultaccess.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
//        duck.quack(); // DOES NOT COMPILE, because function is package private
//        System.out.println(duck.noise); // DOES NOT COMPILE, variable is package private
    }
}