package com.fuadrafid.methodsandencapsulation.accessmodifiers.privateaccess;

public class PrivateAccess {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        duck.quack(); // DOES NOT COMPILE, because function is private
        System.out.println(duck.noise); // DOES NOT COMPILE, because variable is private
    }
}
