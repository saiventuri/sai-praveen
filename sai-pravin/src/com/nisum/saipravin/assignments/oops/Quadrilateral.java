package com.nisum.saipravin.assignments.oops;

/**
 * Quadrilateral class representing a simple geometrical polygon with 4 sides.
 * 
 * @author sai praveen
 *
 */
abstract class Quadrilateral extends Polygon {

    /**
     * Sum of Interior angles which is 360 degrees for a quadrilateral.
     */
    private static final int SUM_OF_INTERIOR_ANGLES = 360;

    /**
     * Protected constructor to be called from sub classes.
     */
    protected Quadrilateral() {
        super(4);
    }

    /**
     * Returns the sum of interior angles.
     * 
     * @return sum of interior angles of quadrilateral.
     */
    @Override
    public int getSumOfInteriorAngles() {
        return SUM_OF_INTERIOR_ANGLES;
    }
}
