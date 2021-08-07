package com.nisum.saipravin.assignments.oops;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Interface written for multiple inheritance demo.
 * 
 * @author sai praveen
 *
 */
public interface MultipleInheritanceDemoInterface {
    
    /**
     * An ambiguous method causing diamond problem.
     */
    public default void method() {

        LoggerUtility.logInfo("This method is from interface");
    }
}
