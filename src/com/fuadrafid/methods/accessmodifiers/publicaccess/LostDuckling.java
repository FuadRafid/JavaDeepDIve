package com.fuadrafid.methods.accessmodifiers.publicaccess;

public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.println("Thanks" + teacher.name); // allowed
    }
}