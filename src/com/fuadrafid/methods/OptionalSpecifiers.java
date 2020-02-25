package com.fuadrafid.methods;

public abstract class OptionalSpecifiers {
    // static - class methods
    static void staticFunction(){ }

    //abstract -  requires the function to be defined on inheritance
    abstract void abstractFunction();

    // final - cannot be overridden
    final void finalFunction(){}

    // synchronized - thread safe
    synchronized void synchronizedFunction(){}

    //native - Used when interacting with code written in another language such as C++.
    native void nativeFunction();

    //strictfp - Used for making floating-point calculations portable.
    strictfp void strictfpFunction(){}
}
