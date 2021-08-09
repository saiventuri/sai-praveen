package com.nisum.saipravin.assignments.javanew;

/**
 * Functional interface for converting string
 * to lower case.
 * 
 * @author sai praveen
 *
 */
@FunctionalInterface
public interface LowerCaseConverter {
    
    /**
     * Converter method used to convert string to lower case.
     * 
     * @param inputString the string that is to be converted into lower case.
     * @return the lower case string.
     */
    public abstract String toLowerCase(String inputString);
}
