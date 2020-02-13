package com.fuadrafid.methodsandencapsulation.protectedaccess.notbird;

import com.fuadrafid.methodsandencapsulation.protectedaccess.birds.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //bird.floatInWater(); // DOES NOT COMPILE, because not in same package as Bird, and floatInWater has default access modifier
        //System.out.println(bird.text); // DOES NOT COMPILE, because not in same package as Bird, and text has default access modifier
    }
}