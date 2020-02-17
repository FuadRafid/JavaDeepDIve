package com.fuadrafid.methodsandencapsulation.protectedaccess.notbird;

import com.fuadrafid.methodsandencapsulation.protectedaccess.birds.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //bird.floatInWater(); // DOES NOT COMPILE, because not in same package as Bird, and floatInWater has protected access modifier and BirdWatcherFromAfar is in different package
        //System.out.println(bird.text); // DOES NOT COMPILE, because not in same package as Bird, and text has protected access modifier and BirdWatcherFromAfar is in different package
    }
}