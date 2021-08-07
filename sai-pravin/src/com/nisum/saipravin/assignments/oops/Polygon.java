package com.nisum.saipravin.assignments.oops;

/**
 * Polygon class representing a simple geometrical polygon.
 * 
 * @author sai praveen
 */
abstract class Polygon {

    /**
     * Holds number of sides of the polygon.
     */
    private int numberOfSides;

    /**
     * Protected constructor to be called from sub classes.
     * 
     * @param numberOfSides the number of sides of the polygon
     */
    protected Polygon(int numberOfSides) {
        super();
        this.numberOfSides = numberOfSides;
    }

    /**
     * Returns number of sides of the polygon.
     * 
     * @return number of sides of the polygon.
     */
    public int getNumberOfSides() {
        return numberOfSides;
    }

    /**
     * Returns the area of the polygon.
     * 
     * @return area of the polygon.
     */
    public abstract int getArea();

    /**
     * Returns the perimeter of the polygon.
     * 
     * @return perimeter of the polygon.
     */
    public abstract int getPerimeter();

    /**
     * Returns the sum of interior angles.
     * 
     * @return sum of interior angles of polygon.
     */
    public abstract int getSumOfInteriorAngles();
}
