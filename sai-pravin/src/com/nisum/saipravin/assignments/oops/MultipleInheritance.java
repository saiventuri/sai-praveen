package com.nisum.saipravin.assignments.oops;

/**
 * Problem Statement: Write a program on Multiple inheritance not supported.
 * 
 * @author sai praveen
 *
 */
public class MultipleInheritance extends MultipleInheritanceDemoClass
                                 implements MultipleInheritanceDemoInterface {

    /**
     * This is a main method used for
     * demonstrating way to handle diamond problem
     * caused due to multiple inheritance.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        
        // Creating object of the class which is extending a class and implementing 
        // interface having same method
        MultipleInheritance object = new MultipleInheritance();
        
        // Class method is given priority than the interface method in this case removing ambiguity.
        object.method();
        
        // Calling interface method
        object.interfaceMethod();
    }

    /**
     * Calls the MultipleInheritanceDemoInterface method.
     */
    public void interfaceMethod() {
        MultipleInheritanceDemoInterface.super.method();
    }

}
