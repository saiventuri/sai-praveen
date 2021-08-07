package com.nisum.saipravin.assignments.oops;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Problem statement: Write a program on Multilevel inheritance.
 * 
 * @author sai praveen
 */
public class MultiLevelInheritance {

    /**
     * This is the main method used
     * to demonstrate multilevel inheritance.
     * @param args unused.
     */
    public static void main(String[] args) {

        // Square class is inherited from Quadrilateral class
        // Quadrilateral class is inherited from Polygon class
        Square s = new Square(5);
        LoggerUtility.logInfo("A square contains "+s.getNumberOfSides()+" sides");
        LoggerUtility.logInfo("Sum of interior angles of square is "+s.getSumOfInteriorAngles()+" degrees");
        LoggerUtility.logInfo("Area of the square with side length "+s.getSide()+" units is "+s.getArea()+" square units");        
    }

}
