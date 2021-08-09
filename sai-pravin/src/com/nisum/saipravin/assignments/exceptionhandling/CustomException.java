package com.nisum.saipravin.assignments.exceptionhandling;

/**
 * A CustomException class.
 * 
 * @author sai praveen
 *
 */
@SuppressWarnings("serial")
public class CustomException extends Exception {

    /**
     * Constructor for creating exception object.
     * 
     * @param string the string that is to be printed on exception in the stack trace.
     */
    public CustomException(String string) {
        super(string);
    }
}
