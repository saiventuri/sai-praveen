package com.nisum.saipravin.assignments.oops;

/**
 * Rectangle class represents a geometrical rectangle.
 * 
 * @author sai praveen
 *
 */
public class Rectangle extends Quadrilateral {

    /**
     * Length of the rectangle.
     */
    private int length;

    /**
     * Width of the rectangle.
     */
    private int width;

    /**
     * Constructor used for creation of rectangle object.
     * 
     * @param length the length of rectangle.
     * @param width the width of rectangle.
     */
    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the area of the rectangle.
     * 
     * @return area of the rectangle.
     */
    @Override
    public int getArea() {
        return length * width;
    }

    /**
     * Returns the perimeter of the rectangle.
     * 
     * @return perimeter of the rectangle.
     */
    @Override
    public int getPerimeter() {
        return 2 * (length + width);
    }
}
