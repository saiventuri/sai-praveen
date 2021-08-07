package com.nisum.saipravin.assignments.oops;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Class written for multiple inheritance demo.
 * 
 * @author sai praveen
 *
 */
public class MultipleInheritanceDemoClass {

    /**
     *  An ambiguous method causing diamond problem.
     */
    public void method()  {

        LoggerUtility.logInfo("This method is from class");
    }

}
