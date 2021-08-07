package com.nisum.saipravin.assignments.oops;

/**
 * Square class represents a geometrical square.
 * 
 * @author sai praveen
 *
 */
public class Square extends Quadrilateral {

    /**
     * Side length of the square.
     */
    private int side;

    /**
     * Gives the side length of the square.
     * 
     * @return the side length.
     */
    public int getSide() {
        return side;
    }

    /**
     * Constructor used for creation of square object.
     * 
     * @param side the side length.
     */
    public Square(int side) {
        super();
        this.side = side;
    }

    /**
     * Returns the area of the square.
     * 
     * @return area of the square.
     */
    @Override
    public int getArea() {
        return side * side;
    }

    /**
     * Returns the perimeter of the square.
     * 
     * @return perimeter of the square.
     */
    @Override
    public int getPerimeter() {
        return side * 4;
    }

}
