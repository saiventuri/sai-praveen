package com.nisum.saipravin.assignments.arrays;

import com.nisum.saipravin.assignments.logging.LoggerUtility;

/**
 * Common utility class containing method used by all problems of arrays.
 * 
 * @author sai praveen
 *
 */
public class ArrayUtilities {

    /**
     * Private constructor as object of this class should never
     * be created.
     */
    private ArrayUtilities() {

        super();
    }

    /**
     * Logs the content of the array.
     * 
     * @param array the array whose content needs to be printed.
     */
    public static void logArray(int[] array) {
        
        String message = "";
        
        for (int e: array) {
            
            message = message.concat(e + "\t");
        }
        
        LoggerUtility.logInfo(message);
    }

}
