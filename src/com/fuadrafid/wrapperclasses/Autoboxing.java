package com.fuadrafid.wrapperclasses;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        //Java converts primitives int wrapper needed, which is called autoboxing

        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // [50.5] autoboxed
        weights.add(new Double(60)); // [50.5, 60.0]
        weights.remove(50.5); // [60.0] autoboxed
        double first = weights.get(0); // 60.0
        System.out.println(weights);

        //CAREFUL: Autoboxing integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1); //this uses the index, does not autobox
        System.out.println(numbers);// will print [1]
        numbers.remove(new Integer(1)); // this forces to use wrapper class
        System.out.println(numbers);//[]

    }
}
